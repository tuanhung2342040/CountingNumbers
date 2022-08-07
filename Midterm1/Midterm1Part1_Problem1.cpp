#include <iostream>
#include <cstdlib>
#include <ctime>
#include <cmath>
#include <climits>

using namespace std;


int GenerateRandomValue(int min, int max){
	return min + (rand() % (max - min + 1));
}

int** GenerateRandom2DArray(int rows, int cols, int min, int max){
	int** arr2D = new int*[rows];
	for(int i = 0; i < rows; i++){
		arr2D[i] = new int[cols];
	}

	for(int i = 0; i < rows; i++){
		for(int j = 0; j < cols; j++){
			arr2D[i][j] = GenerateRandomValue(min, max);
		}
	}

	return arr2D;
}

void Display2DArray(int** arr, int rows, int cols) {
	cout << "--------------\n";
	cout << "--------------\n";
	
	for(int i = 0; i < rows; i++){
		for(int j = 0; j < cols; j++){
			cout << arr[i][j] << "\t";
		}
		cout << endl;
	}

	cout << "--------------\n";
	cout << "--------------\n";
}

/**
 * @brief Returns a 2D Array with n rows and 2 columns per row where
 * each row contains the two closest integers from the corresponding
 * row of arr (this also has n rows but has p columns per row).
 * Suppose the parameter rows represents n and the parameter cols
 * represents p.
 * 
 * See sample output after main for examples.
 * 
 * @param arr, 2D array of integers with dimensions rows x cols
 * @param rows, int, number of rows in arr 
 * @param cols, int, number of cols in arr
 * @return int**, 2D array with dimensions rows x 2 as described above
 */

int** ClosestPairs(int** arr, int rows, int cols){
	int** pair = new int*[rows];
	for(int i = 0; i < rows; i++){
		pair[i] = new int[2];
	}
	int** diff = new int*[rows];
	for(int i = 0; i < rows; i++){
		diff[i] = new int[cols];
	}
	int difference = 0;
	for(int k = 0; k < rows; k++){
		for(int i = 0; i < cols - 1; i++){
			for(int j = i + 1; j < cols; j++){
				int difference = abs(pair[i] - pair[j]);
				diff[i][j] = difference;
				int smallest = diff[0][0];
				if(smallest > diff[j]){
					smallest = diff[j]
				}
			}
		}
	}

	return pair;
}


/**
 * @brief Displays contents of a 2D array with dimensions rows x 2 as 
 * shown in sample output after main.
 * 
 * Each row in pairs contains 2 integers.
 * 
 * @param pairs, 2D array of integers with dimensions rows x 2
 * @param rows, int, number of rows in arr 
 */
void ShowPairs(int** pairs, int rows){
	cout << "--------------\n";
	cout << "--------------\n";
	
	for(int i = 0; i < rows; i++){
		for(int j = 0; j < 2; j++){
			cout << pairs[i][j] << "\t";
		}
		cout << endl;
	}

	cout << "--------------\n";
	cout << "--------------\n";
}

/**
 * @brief Deallocate memory for arr2D and pairs
 */
void FreeMemory(int** &arr2D, int** &pairs, int rows){
	for(int i = 0; i < rows; i++){
		delete[] arr2D[i];
		arr2D[i] = nullptr;
	}
	if(arr2D != nullptr){
		delete arr2D;
		arr2D = nullptr;
	}
	for(int i = 0; i < rows; i++){
		delete[] pairs[i];
		pairs[i] = nullptr;
	}
	if(pairs != nullptr){
		delete arr2D;
		pairs = nullptr;
	}
}

int main(){
	srand(time(0));
    int rows = 5, cols = 4;
    int** arr2D = GenerateRandom2DArray(rows, cols, 10, 200);
    cout << "The 2D array with " << rows << " rows and " << cols << " columns:\n";
    Display2DArray(arr2D, rows, cols);

	int** pairs = ClosestPairs(arr2D, rows, cols);
	
	cout << "Closest pairs of values (per row) in the array above:\n";
	ShowPairs(pairs, rows);

	FreeMemory(arr2D, pairs, rows);

    return 0;
}

/*

The 2D array with 5 rows and 4 columns:
--------------
--------------
55      112     14      142
12      107     89      38
136     90      187     142
123     77      113     59
95      64      71      199
--------------
--------------
Closest pairs of values (per row) in the array above:
Row 0: 112, 142
Row 1: 107, 89
Row 2: 136, 142
Row 3: 123, 113
Row 4: 64, 71

*/