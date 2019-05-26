#include <string>
#include <cstring>
#include <fstream>
#include <iostream>
#include <algorithm>
#include "dictionary.h"

namespace dictionary {
    map<string,string> dic;
    vector<string> keywords;
}

void dictionary::init_dictionary(const char* filepath) {
    ifstream f(filepath, ios_base::in);
    string key, value;
    size_t pos;
    for (string line; getline(f, line); ) {
        pos = line.find(';');
        if (pos != string::npos) {
            key = line.substr(0, pos);
            value = line.substr(pos + 1);
            if (value.empty()) keywords.push_back(key);
            else dic.insert({key, value});
        }
    }
    f.close();
}

char* dictionary::getConst(char* ascii) {
    string str_ascii(ascii);
    string str;
    if ((str_ascii == "{:")||(str_ascii == ":}")) str = ".";
    else {
        if (dic.count(str_ascii)) str = "\\" + dic.at(str_ascii);
        else {
            if (count(keywords.begin(), keywords.end(), str_ascii)) str = "\\" + str_ascii;
            else str = str_ascii;
        }
    }
    return strdup(str.c_str());
}

char* dictionary::getLeft(char* left) {
    char* str = strdup("\\left");
    strcat(str, getConst(left));
    return str;
}

char* dictionary::getRight(char* right) {
    char* str = strdup("\\right");
    strcat(str, getConst(right));
    return str;
}