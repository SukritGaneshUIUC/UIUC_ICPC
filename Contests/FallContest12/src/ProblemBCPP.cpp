using namespace std;
#include <string>
#include <iostream>

int main() {
  string s;
  cin >> s;

  char minChar = s.at(0);

  for (char c: s) {
    if (c <= minChar) {
      cout << "Mike" << endl;
      minChar = c;
    } else {
      cout << "Ann" << endl;
    }
  }
}
