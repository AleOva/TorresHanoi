# Programa de Ordenamiento Burbuja
# Arreglo inicial
arreglo = [8, 10, 35, 4, 3, 16, 28]

print("Arreglo original:", arreglo)
print("-" * 40)

# Algoritmo de Ordenamiento Burbuja
n = len(arreglo)

# Bucle externo: controla el número de pasadas
for i in range(n):
    # Bucle interno: compara elementos adyacentes
    for j in range(0, n - i - 1):
        # Si el elemento actual es mayor que el siguiente, se intercambian
        if arreglo[j] > arreglo[j + 1]:
            # Intercambio en Python (muy elegante)
            arreglo[j], arreglo[j + 1] = arreglo[j + 1], arreglo[j]
    
    # Imprimimos el arreglo después de cada pasada para ver el progreso
    print(f"Pasada {i + 1}: {arreglo}")

print("-" * 40)
print("Arreglo ordenado:", arreglo)