

void
main(void)
{
    int
vNumeros[tamano];
int
j, i, temp;

clrscr();
w
printf("Introduce los %d números a ordenar:\n", tamano);


for (i = 0; i < tamano; i++)
{
    printf("%d: ", i + 1);
scanf ("%d", & vNumeros[i]);
printf ("\n");
}


for (i = 0; i < (tamano - 1); i++)
{
for (j = i + 1; j < tamano; j++)
{
if (vNumeros[j] < vNumeros[i])
{
temp = vNumeros[j];
vNumeros[j] = vNumeros[i];
vNumeros[i] = temp;
}
}
}


printf ("Los números ordenados son:\n");
for (i = 0; i < tamano; i++)
{
printf("%d, ", vNumeros[i]);
}
printf("\n\n\n");
system("PAUSE");
}
