# include<iostream>
using
namespace
std;

int
main()
{

    int
matriz[4][4], horizontal[4], vertical[4], fila, columna, suma = 0, i;

/ *Bucle
que
registra
los
numeros
introducidos
de
teclado * /
for (fila=1;fila <= 2;fila++)
{
for (columna=1;columna <= 2;columna++)
{
cout << "Introduce un numero para la posicion" << fila << columna << ":";
cin >> matriz[fila][columna];
}
}
for (int i=1;i <= 2;i++){
for (int j=1;j <= 2;j++){

cout << matriz[i][j] << "  ";

} cout << "\n";}

for (fila=1;fila <= 2;fila++)
{
suma=0;
for (columna=1;columna <= 2;columna++)
{
suma += matriz[fila][columna];
}
vertical[fila]=suma;
}


for (i=1;i < 2;i++)
{
cout << vertical[i];
}


for (columna=1;columna <= 2;columna++)
{
suma=0;
for (fila=1;fila <= 2;fila++)
{
suma += matriz[fila][columna];
}
horizontal[columna]=suma;
}


for (i=1;i < 02;i++)
{
cout << "  " << horizontal[i] << "\n";

}

return 0;
}
