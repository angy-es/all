#include <iostream>
using namespace std;

int linearSearch(int arr[], int n, int key, int index) {
    if (index == n)
        return -1; // Element not found

    if (arr[index] == key)
        return index;

    return linearSearch(arr, n, key, index + 1);
}

int main() {
    int arr[] = {10, 20, 30, 40, 50};
    int n = sizeof(arr) / sizeof(arr[0]);
    int key = 40;

    int result = linearSearch(arr, n, key, 0);

    if (result != -1)
        cout << "Element found at index " << result;
    else
        cout << "Element not found";

    return 0;
}