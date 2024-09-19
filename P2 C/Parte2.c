#include <stdio.h>

void sumaEnteros(int arr[], int n, int target) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (arr[i] + arr[j] == target && i != j) {
                printf("Indices: %d, %d\n", i, j);
                return; // Termina la función una vez se encuentran los índices
            }
        }
    }
    printf("No se encontraron dos enteros cuya suma sea igual a %d.\n", target);
}

int main() {
    int n, target;

    // Solicitar el tamaño del arreglo
    printf("Ingresa el tamaño del arreglo: ");
    scanf("%d", &n);

    int arr[n];

    // Solicitar los valores del arreglo
    printf("Ingresa los elementos del arreglo:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Solicitar el valor de target
    printf("Ingresa el valor de target: ");
    scanf("%d", &target);

    // Llamar a la función para encontrar los índices
    sumaEnteros(arr, n, target);

    return 0;
}
