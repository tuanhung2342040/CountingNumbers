#ifndef NODE_H
#define NODE_H

class Node{
public:
    int element;
    Node* left;
    Node* right;
    int height;
    int balanceFactor;

    Node(){
        element = 0;
        left = right  = nullptr;
        height = 0;
        balanceFactor = 0;
    }

    Node(int i){
        element = i;
        left = right = nullptr;
        height = 0;
        balanceFactor = 0;
    }

    void ComputeHeight(){
        height = ComputeHeight(this);
    }

    int ComputeHeight(Node* n){
        if(n == nullptr){
            return 0;
        }
        else if(n->left == nullptr && n->right == nullptr){
            return 0;
        }
        else if(n->left != nullptr && n->right == nullptr){
            return 1 + ComputeHeight(n->left);
        }
        else if(n->left == nullptr && n->right != nullptr){
            return 1 + ComputeHeight(n->right);
        }
        else{
            int leftH = ComputeHeight(n->left);
            int rightH = ComputeHeight(n->right);
            if(leftH > rightH){
                return 1 + leftH;
            }
            else{
                return 1 + rightH;
            }
        }
    }

    void ComputeBalanceFactor(){
        balanceFactor = ComputeBalanceFactor(this);
    }

    int ComputeBalanceFactor(Node* n){
        if(n == nullptr){
            return 0;
        }
        else{
            return ComputeHeight(n->right) - ComputeHeight(n->left);
        }
    }



};

#endif