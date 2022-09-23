#include <iostream>
#include "BST.h"

using namespace std;

int main(){

    BST tree;

    tree.Insert(100); // root node added
    tree.Insert(50);
    tree.Insert(150);
    tree.Insert(30);
    tree.Insert(70);

    Node* testNode = tree.Search(100);

    cout << "Node value: " << testNode->element << endl;

    testNode->ComputeHeight();

    cout << "Node height: " << testNode->height << endl;

    testNode->ComputeBalanceFactor();

    cout << "Node balance factor: " << testNode->balanceFactor << endl;
    
    
    // tree.InOrderDisplay();

    // //tree.clear();

    // tree.remove(50);

    // tree.InOrderDisplay();

    // //tree.IncrementNodes();

    // tree.InOrderDisplay();

    // cout << tree.CountTotal() << endl;

    // cout << tree.CountOddNodes() << endl;

    // tree.DeleteAllNodes();

    // tree.Insert(123);
    // tree.Insert(456);

    // tree.InOrderDisplay();

    // tree.DeleteAllNodes();


    return 0;
}