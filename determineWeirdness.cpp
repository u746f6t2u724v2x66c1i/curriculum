#include <iostream>
#include <string>
#include <algorithm>
#include <functional>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
string determineWeirdness(int N);

int main()
{
    string N_temp;
    getline(cin, N_temp);

    int N = stoi(ltrim(rtrim(N_temp)));

    string result = determineWeirdness(N);
    cout << result;

    return 0;
}

string ltrim(const string &str)
{
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), [](int c) { return !isspace(c); }));

    return s;
}

string rtrim(const string &str)
{
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), [](int c) { return !isspace(c); }).base(),
        s.end());

    return s;
}

string determineWeirdness(int N)
{
    if (N % 2 != 0)
        return "Weird\n";
    else
    {
        if (N >= 2 && N <= 5)
            return "Not Weird\n";
        else if (N >= 6 && N <= 20)
            return "Weird\n";
        else
            return "Not Weird\n";
    }
}

