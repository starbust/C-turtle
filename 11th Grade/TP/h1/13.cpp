/*
#school - ТУЕС
#class - 11Б
#num - 22
#name - Михаил Михайлов Здравков
#task - Да се разработи програма, която изисква от потребителя да въведе целочислено число x, където 0<x<10. Да се инициализира масив от 10 елемента. Да се намери сумата от всички числа в интервала [0; 1000) делящи се на x и да се запише като първа стойност в масива. Да се намери сумата от всички числа в интервала [0;1000) деляща се на 2x и да се запише като втора стойност в масива. Аналогично да се намери сумата на всички числа делящи се на Nx за N в интервала [1;10] и да се запишат като елемент N-1 в масива. Масивът да се изведе на стандартния изход.
*/

#include<iostream>
#include<math.h>
#include<stdlib.h>

using namespace std;

int main(){
    int x;
    int i, j, array[10], sum = 0;

    cout<< "Enter 0<x<10: " <<endl;
    do{
        cin>> x;
    }while(x <= 0 || x >= 10);

    cout<<endl;
    cout<<endl;

    for (i = 1; i <= 10; i++){
        for (j = 0; j < 1000; j++){
            if (j % (i*x) == 0) {
                sum += j;
            }
        }
        array[i-1] = sum;
        sum = 0;
        cout<< array[i-1] <<endl;
    }
	
	return 0;
}

