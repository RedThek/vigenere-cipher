#include <iostream>
using namespace std;

char vigenereEncrypt(char message, int key);
char vigenereDecrypt(char message, int key);

int main() {

    char message, action;
    int key;
    cout << "Enter a message to encrypt: ";
    cin >> message;
    cout << "Enter a key: ";
    cin >> key;
    cout << "Select an action : Encrypt (E) / Decrypt (D): ";
    cin >> action;
    return 0;
}

char vigenereEncrypt(char message, int key) {
    return (message + key - 'a') % 26 + 'a';
}

char vigenereDecrypt(char message, int key) {
    return (message - key - 'a' + 26) % 26 + 'a';
}
