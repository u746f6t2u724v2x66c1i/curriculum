from queue import Queue

class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

class Solution:
    @staticmethod
    def level_order(root):
        if root is None:
            return
        
        q = Queue()
        q.put(root)
        
        while not q.empty():
            level_size = q.qsize()
            for i in range(level_size):
                current = q.get()
                print(current.data, end=" ")
                
                if current.left:
                    q.put(current.left)
                if current.right:
                    q.put(current.right)
                    
            print()  # Newline after each level

    @staticmethod
    def insert(root, data):
        if root is None:
            return Node(data)
        else:
            if data <= root.data:
                root.left = Solution.insert(root.left, data)
            else:
                root.right = Solution.insert(root.right, data)
            return root

if __name__ == "__main__":
    T = int(input())
    root = None
    for _ in range(T):
        data = int(input())
        root = Solution.insert(root, data)
    
    Solution.level_order(root)

