#include <stdio.h>

char vigenereEncrypt(char message, int key);
char vigenereDecrypt(char message, int key);

int main() {

    char message, action;
    int key;
    printf("Enter a message to encrypt: ");
    scanf(" %c", &message);
    printf("Enter a key: ");
    scanf("%d", &key);
    printf("Select an action : Encrypt (E) / Decrypt (D): ");
    scanf(" %c", &action);
    return 0;
}

char vigenereEncrypt(char message, int key) {

}

char vigenereDecrypt(char message, int key){

}