#include "stdafx.h" 
#include <iostream> 
using namespace std;



int main()
{
	setlocale(LC_ALL, "Russian");

	int h, m, s, h1, m1, s1, h4;
	
	int k = 0;
	while (k < 2) {
		cout << "vvedite znachenye chasa : "; cin >> h;
		if (h > 23 || h < 0) {
			cout << "time error, loshara" << endl;
			cout << "vvedite korrektnoe znachenye chasa : "; cin >> h4;
			if (h4 > 23 || h4 < 0) {
				cout << "loshara"<< endl;
				exit(0);
			}
		}
		else {
			k = 2;
		}
	}
	cout << "vvedite znachenye minut : "; cin >> m;
	cout << "vvedite znachenye sekund : "; cin >> s;
	cout << endl;
	cout <<"=============================================";
	cout << endl;
	cout << "tekushee time " << h<<" : "<< m <<" : "<< s << endl;
	cout << "============================================="<< endl;
	cout << endl;


	cout << "vvedite znachenye proshedshego chasa : "; cin>> h1;
	cout << "vvedite znachenye proshedshich minut : "; cin>> m1;
	cout << "vvedite znachenye proshedshich sekund : "; cin>> s1;
	cout << endl;
	cout << "=============================================";
	cout << endl;
	cout << "vas interesuet vremya, kotoroe bylo " << h1 <<" : "<< m1 <<" : "<< s1 <<" nazad"<< endl;
	cout << "============================================="<< endl;
	cout << endl;

	int t1 = h * 3600 + m * 60 + s;
	int t2 = h1 * 3600 + m1 * 60 + s1;
	int t3 = t1 - t2;
	if (t3 < -3600) {
		t3 = t1 - t2 + 172800;
	}
	if (t3 < 0)
	{
		t3 = t1 - t2 + 86400;
	}


	int h2 = t3 / 3600;
	int m2 = (t3 % 3600) / 60;
	int s2 = (t3 % 3600) % 60;



	cout << "============================================="<< endl;
	cout <<"interesuyushee vas vremya " << h2 << ":" << m2 << ":" << s2 << endl;
	cout<< "============================================="<< endl;
	return 0;
}