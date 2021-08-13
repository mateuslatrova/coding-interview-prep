#include <bits/stdc++.h>

using namespace std;

/*
 * Complete the 'rotLeft' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER d
 */

vector<int> rotLeft(vector<int> a, int d) {
    int n = a.size();
    vector<int> res(n);

    for (int i = 0; i < n; i++) {
        res[i] = a[(i+d)%n];
    }

    return res;
}