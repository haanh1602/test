#include <bits/stdc++.h>
// danh sap git hub
using namespace std;

class Set {
private:
	int size;
	int element[100000000];
	
public:
	
	int getSize() {
		return size;
	}
	
	int getElement(int i) {
		return element[i];
	}
	
	set() {
		size = 0;
	}
	
	void add(int n) {
		bool instance = false;
		for(int i = 0; i < size; i++) {
			if(n == element[i]) {
				instance = true;
				break;
			}
		}
		if(!instance) {
			element[size++] = n;
		}
	}
	
	void add(Set other) {
		for(int i = 0; i < other.getSize(); i++) {
			add(other.getElement(i));
		}
	}
	
	void display() {
		for(int i = 0; i < size; i++) {
			cout << element[i] << " ";
		}
		cout << endl;
	}
};

/*set cross(set a, set b) {
	set res;
	
	return res;
}*/

int main() {
	int na, nb;
	
	cin >> na;
	Set a = Set();
	for(int i = 0; i < na; i++) {
		int num;
		cin >> num;
		a.add(num);
	}
	a.display();
	/*cin >> nb;
	vector<int> b(nb);
	for(int i = 0; i < nb; i++) {
		cin >> b[i];
	}
	
	process(a, b);*/
	
	return 0;
}
