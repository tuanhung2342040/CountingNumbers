#include <iostream>
#include "Node.h"

using namespace std;

#ifndef BST_H
#define BST_H

class BST{
public:
    Node* root;

    BST(){
        root = nullptr;
    }

    bool Insert(int x){
        // add x to the binary search tree
        if(root == nullptr){
            root = new Node(x);
            return true;
        }
        else{
            Node* parent = nullptr;
            Node* current = root;
            while(current != nullptr){
                if(x < current->element){
                    parent = current;
                    current = current->left;
                }
                else if(x > current->element){
                    parent = current;
                    current = current->right;
                }
                else{
                    cout << "no duplicates allowed!\n";
                    return false;
                }
            }
            
            // found parent of value
            // so put value in a new node and attach
            // to the parent
            if(x < parent->element){
                parent->left = new Node(x);
            }
            else{
                parent->right = new Node(x);
            }

            return true;
        }
    }

    void InOrderDisplay(){
        if(root == nullptr){
            cout << "Tree is empty, nothing to display\n";
            return;
        }
        else{
            InOrderDisplay(root);
            cout << endl;
        }
    }

    void InOrderDisplay(Node* someTreeNode){
        if(someTreeNode == nullptr){
            return;
        }
        else{
            
            
            InOrderDisplay(someTreeNode->left);

            // what to do at each node? In this case, display a node's value
            cout << someTreeNode->element << ", ";

            InOrderDisplay(someTreeNode->right);

            
        }
    }

    // hector
    void IncrementNodesHelper(Node* myRoot) {
        if(myRoot == nullptr) {
            return;
        } else {
            myRoot->element++;
            IncrementNodesHelper(myRoot->left);

           
            
            IncrementNodesHelper(myRoot->right);

            
            
        }
    }

    void IncrementNodes() {
        if(root == nullptr) {
            cout << "nothing to increment, tree is empty" << endl;
            return;
        } else {
            IncrementNodesHelper(root);
        }
    }

    // caiden
    int CountTotal() {
        if (root == nullptr) {
            return 0;
        } else {
            int count =0;
            RecCounter(count, root);
            return count;
        }
        
    }
    
    void RecCounter(int &count, Node *moveNode ) {
        if (moveNode == nullptr) {
            return;
        } else{
            
            RecCounter(count, moveNode->left);
            
            RecCounter(count, moveNode->right);

            count++;
            
        }
    }

    // pablo
    int CountOddNodes(Node* someTreeNode){
        if(someTreeNode == nullptr){
            return 0;
        }
        else{
            return (someTreeNode->element % 2) + CountOddNodes(someTreeNode->left)+ CountOddNodes(someTreeNode->right);
        }
    }
    int CountOddNodes(){
        return CountOddNodes(root);
    }

    // vincent
    void clear(){
        if(root == nullptr){
            cout << "tree is empty\n";
            return;
        }
        else{
            clear(root);
            root = nullptr;
        }
    }
    void clear(Node *curr) {
        if (curr == nullptr)
        {
            return;
        }
        Node *l = curr->left;
        Node *r = curr->right;
        cout << curr->element << endl;
        clear(l);
        clear(r);
        delete curr;
    }


    // // sam
    // void DeleteAll()
    // {
    //     DeleteAll(root, nullptr);

    //     if(root != nullptr){
    //         delete root;
    //         root = nullptr;
    //     }

    //     return;
    // }

    // void DeleteAll(Node* thisNode, Node* parent)
    // {
    //     if(thisNode == nullptr)
    //     {
    //         return;
    //     }
    //     else
    //     {
    //         DeleteAll(thisNode->left, thisNode);
            
    //         DeleteAll(thisNode->right, thisNode);
    //         if(parent != nullptr){
    //             if(thisNode == parent->left){
    //                 parent->left = nullptr;
    //             }
    //             else{
    //                 parent->right = nullptr;
    //             }

    //             cout << "removing " << thisNode->element << endl;
    //             delete thisNode;
    //             thisNode = nullptr;
    //         }

    //         return;
    //     }
    // }

    // void DeleteAllNodes(){
    //     if(root == nullptr){
    //         cout << "tree is empty! nothing to delete\n";
    //         return;
    //     }
    //     else{
    //         DeleteAllNodes(root, nullptr);
    //         cout << "removing root: " << root->element << endl;
    //         delete root;
    //         root = nullptr;
    //     }
    // }

    // void DeleteAllNodes(Node* someNode, Node* parent){
    //     if(someNode == nullptr){
    //         return;
    //     }
    //     else{
    //         DeleteAllNodes(someNode->left, someNode);

    //         DeleteAllNodes(someNode->right, someNode);

    //         if(parent != nullptr){
    //             if(parent->left == someNode){
    //                 cout << "removing " << someNode->element << endl;

    //                 delete someNode;

    //                 parent->left = nullptr;
    //             }
    //             else{
    //                 cout << "removing " << someNode->element << endl;

    //                 delete someNode;

    //                 parent->right = nullptr;
    //             }
    //         }
    //     }

    // }

    Node* Search(int value){
        if(root == nullptr){
            cout << "tree is empty" << endl;
            return nullptr;
        }
        else{
            return Search(root, value);
        }
    }

    Node* Search(Node* someNode, int value){
        if(someNode == nullptr){
            return nullptr;
        }
        else{
            if(someNode->element == value){
                return someNode;
            }
            else{
                if(value < someNode->element){
                    return Search(someNode->left, value);
                }
                else{
                    return Search(someNode->right, value);
                }
            }
        }
    }

    //// remove from Liang, textbook (non-templated)
    bool remove(int element)
    {
        // Locate the node to be deleted and also locate its parent node
        Node* parent = nullptr;
        Node* current = root;
        //O(log2(n))
        while (current != nullptr)
        {
            if (element < current->element)
            {
                parent = current;
                current = current->left;
            }
            else if (element > current->element)
            {
                parent = current;
                current = current->right;
            }
            else
                break; // Element is in the tree pointed by current
        }

        if (current == nullptr)
            return false; // Element is not in the tree

        // Case 0: easiest case i.e. deleting a leaf node
        if(current->left == nullptr && current->right == nullptr){
            if(parent->left == current){
                parent->left = nullptr;
            }
            else{
                parent->right = nullptr;
            }

            delete current;
            return true;
        }
        // Case 1: current has no left child
        else if (current->left == nullptr)
        {
            // Connect the parent with the right child of the current node
            if (parent == nullptr)
            {
                root = current->right;
            }
            else
            {
            if (element < parent->element)
                parent->left = current->right;
            else
                parent->right = current->right;
            }

            current->right = nullptr;
            delete current; // Delete current
        }
        else
        {
            // Case 2: The current node has a left child
            // Locate the rightmost node in the left subtree of
            // the current node and also its parent
            Node* parentOfRightMost = current;
            Node* rightMost = current->left;

            while (rightMost->right != nullptr)
            {
                parentOfRightMost = rightMost;
                rightMost = rightMost->right; // Keep going to the right
            }

            // Replace the element in current by the element in rightMost
            current->element = rightMost->element;

            // Eliminate rightmost node
            if (parentOfRightMost->right == rightMost)
                parentOfRightMost->right = rightMost->left;
            else
                // Special case: parentOfRightMost->right == current
                parentOfRightMost->left = rightMost->left;

            delete rightMost; // Delete rightMost
        }

        return true; // Element inserted
    }

    // Node *getParent(Node *child)
    // {
    //     if (child == root)
    //     {
    //         return nullptr;
    //     }
    //     Node *curr = root;
    //     while (curr != nullptr)
    //     {
    //         if (child == curr->left || child == curr->right)
    //         {
    //             return curr;
    //         }
    //         else if (child->element < curr->element)
    //         {
    //             curr = curr->left;
    //         }
    //         else
    //         {
    //             curr = curr->right;
    //         }
    //     }
    //     return nullptr;
    // }

    // Node *getMaxNode(Node *curr)
    // {
    //     if (curr->right == nullptr)
    //     {
    //         return curr;
    //     }
    //     return getMaxNode(curr->right);
    // }



    // // vincent - deleting root node NOT TESTED properly yet
    // void remove(Node *start, int element)
    // {
    //     if (root == nullptr)
    //     {
    //         return;
    //     }
    //     Node *curr = start;
    //     while (curr != nullptr && curr->element != element)
    //     {
    //         if (element < curr->element)
    //         {
    //             curr = curr->left;
    //         }
    //         else
    //         {
    //             curr = curr->right;
    //         }
    //     }
    //     if (curr == nullptr)
    //     {
    //         cout << "Not founds" << endl;
    //         return;
    //     }

    //     if (curr->left == nullptr && curr->right == nullptr)
    //     {
    //         cout << "leaf" << endl;
    //         if (curr == root)
    //         {
    //             delete curr;
    //             root = nullptr;
    //             return;
    //         }
    //         Node *parent = getParent(curr);
    //         if (curr->element < parent->element)
    //         {
    //             delete curr;
    //             parent->left = nullptr;
    //         }
    //         else
    //         {
    //             delete curr;
    //             parent->right = nullptr;
    //         }
    //     }
    //     else if (curr->left == nullptr)
    //     {
    //         cout << "right only" << endl;
    //         if (curr == root)
    //         {
    //             Node *newRoot = root->right;
    //             delete curr; // or delete root;
    //             root = newRoot;
    //         }
    //         Node *replacement = curr->right;
    //         Node *parent = getParent(curr);
    //         cout << parent->element << endl;
    //         if (curr->element < parent->element)
    //         {
    //             parent->left = replacement;
    //             delete curr;
    //         }
    //         else
    //         {
    //             parent->right = replacement;
    //             delete curr;
    //         }
    //     }
    //     else
    //     {
    //         // consider root node
    //         // assume not root currently
    //         // cout << "has left" << endl;
    //         // cout << curr->element << endl;
    //         Node *replacement = getMaxNode(curr->left);
    //         // cout << replacement->element << endl;
    //         Node *replacementParent = getParent(replacement);
    //         // cout << replacementParent->element << endl;
    //         curr->element = replacement->element;
    //         if (replacement->left == nullptr)
    //         {
    //             cout << "Null case " << endl;
    //             if (replacement->element < replacementParent->element)
    //             {
    //                 cout << "left case ";
    //                 replacementParent->left = nullptr;
    //                 delete replacement;
    //             }
    //             else
    //             {
    //                 cout << "right case ";
    //                 replacementParent->right = nullptr;
    //                 delete replacement;
    //             }
    //         }
    //         else
    //         {
    //             cout << " NOt Null case " << endl;
    //             replacementParent->right = replacement->left;
    //             delete replacement;
    //         }
    //     }
    // }



};


#endif