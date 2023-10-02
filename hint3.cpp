#include <iostream>
using namespace std;

int main() {
  char x[] = "Piazza";
  int len = (sizeof(x) / sizeof(x[0])) - 1;

  char *foo = x + 1;
  *foo += 3;

  char *last = x;
  while (foo < x + len) {
    if (*foo == *last) {
      break;
    }
    last = foo;
    foo++;
  }
  *foo = *(foo + 1);

  for (int i = 0; i < len - 1; i++) {
    cout << x[i];
  }
  cout << endl;
}
