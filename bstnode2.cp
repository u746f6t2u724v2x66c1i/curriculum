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
    static void levelOrder(Node* root) {
        if (root == nullptr)
            return;

        queue<Node*> q;
        q.push(root);

        while (!q.empty()) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; ++i) {
                Node* current = q.front();
                q.pop();
                cout << current->data;

                if (i < levelSize - 1)
                    cout << " "; // Print space if not the last node of the level

                if (current->left != nullptr)
                    q.push(current->left);
                if (current->right != nullptr)
                    q.push(current->right);
            }
            if (!q.empty()) // Add a check to avoid printing an extra space at the end
                cout << " "; // Print space between levels
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
    int T;
    cin >> T;
    Node* root = nullptr;
    while (T-- > 0) {
        int data;
        cin >> data;
        root = Solution::insert(root, data);
    }
    Solution::levelOrder(root);
    return 0;
}

