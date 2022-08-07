#include <iostream>
#include <vector>
#include <climits>
using namespace std;

template<typename T>
class QueueV{
private:
    vector<T> items; 
    int capacity;
public:
    // constructor
    QueueV(){
        capacity = 5; 
    }
    // size of the items
    int size(){
        return items.size();
    }
    
    // removes the item at the front and returns it
    void Dequeue(){
        T removedItem = *items.begin();
        items.erase(items.begin());
    }
    /**
     * @brief enqueue a new item from back of the queue
     * 
     * @param item : int the value of the item
     */
    void Enqueue(T item){
        if(size() < capacity){
            items.push_back(item);
        }
        else{
            T smallest = INT_MAX;
            int indexSmallest = 0;
            for(int i = 0; i < capacity; i++){
               if(items[i] < smallest){
                  smallest = items[i];
                  indexSmallest = i;
              }
            }
            for(int i = 0; i < indexSmallest; i++){
                T temp = Dequeue();
                items.push_back(temp);
            }
            Dequeue();
            for(int i = 0; i < size() - indexSmallest; i++){
                T temp = Dequeue();
                items.push_back(temp);
            }
            items.push_back(item);
        }
    }    
    /**
     * @brief check the the queue is empty or not
     * 
     * @return true : if there are no items
     * @return false : if there are items 
     */
    bool IsEmpty(){
        if(size() == 0)
            return true;
        return false;
    }   
    /**
     * @brief show all the items of the queue from front to rear
     */
    void Display(){
        cout << "The Queue: ";
        for(int i = 0; i < size(); i++){
            cout << items[i] << " ";
        }
        cout << endl;
    }
    



};

int main(){
    QueueV<int> q;
    q.Enqueue(3);
    q.Enqueue(2);
    q.Enqueue(1);
    q.Enqueue(6);
    q.Enqueue(7);

    q.Display();
    q.Enqueue(100);
    q.Enqueue(1000);
    q.Enqueue(12);
    q.Display();
    

    return 0;
}