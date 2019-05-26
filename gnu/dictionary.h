#ifndef DICTIONARY_H
#define DICTIONARY_H

#include <map>
#include <vector>

using namespace std;

namespace dictionary {

    extern map<string,string> dic;
    extern vector<string> keywords;

    void init_dictionary(const char* filepath);

    char* getConst(char* ascii);
    char* getLeft(char* left);
    char* getRight(char* right);

}

#endif // DICTIONARY_H