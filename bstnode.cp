#include <iostream>
#include <queue>
using namespace std;

struct Node {
    int data;
    Node* left;
    Node* right;

    Node(int data) {
        this->data = data;
        left = nullptr;
        right = nullptr;
    }
};

class Solution {
public:
    static int getHeight(Node* root) {
        if (root == nullptr) {
            return -1; // height of an empty tree is -1
        } else {
            int leftHeight = getHeight(root->left);
            int rightHeight = getHeight(root->right);

            return max(leftHeight, rightHeight) + 1;
        }
    }

    static Node* insert(Node* root, int data) {
        if (root == nullptr) {
            return new Node(data);
        } else {
            Node* cur;
            if (data <= root->data) {
                cur = insert(root->left, data);
                root->left = cur;
            } else {
                cur = insert(root->right, data);
                root->right = cur;
            }
            return root;
        }
    }
};

int main() {
    int n;
    cin >> n;
    Node* root = nullptr;
    for (int i = 0; i < n; ++i) {
        int data;
        cin >> data;
        root = Solution::insert(root, data);
    }
    int height = Solution::getHeight(root);
    cout << height << endl;
    return 0;
}

