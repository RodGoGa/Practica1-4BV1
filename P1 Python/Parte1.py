# Autor: Rodrigo González Garcés 4BV1

# Formulas para el cuadrado
print("Fórmulas para el cuadrado")
lado_cuadrado = float(input("Ingresa los metros de largo del cuadrado: "))
lado_cuadrado_cm = lado_cuadrado * 100
# Área del cuadrado
print(f"    El área del cuadrado en cm² es: {lado_cuadrado_cm * lado_cuadrado_cm:.2f} cm²")
# Perímetro del cuadrado
print(f"    El perímetro del cuadrado en cm es: {lado_cuadrado_cm * 4:.2f} cm")

print()
# Fórmula para el área del triángulo en m
print("Fórmula para el área del triángulo en m:")
alto_triangulo = float(input("Ingresa el alto del triángulo: "))
base_triangulo = float(input("Ingresa la base del triángulo: "))
alto_triangulo_cm = alto_triangulo * 100
base_triangulo_cm = base_triangulo * 100
# Área del triángulo
print(f"    El área del triángulo es: {(base_triangulo_cm * alto_triangulo_cm) / 2:.2f} cm²")

print()
# Fórmulas para el círculo
print("Fórmulas para el círculo")
diametro_circulo = float(input("Ingresa el diámetro del círculo en m: "))
diametro_circulo_cm = diametro_circulo * 100
# Área del círculo
print(f"    El área del círculo es: {(3.1415 * (diametro_circulo_cm ** 2)) / 4:.2f} cm²")
# Perímetro del círculo
print(f"    El perímetro del círculo es: {3.1415 * diametro_circulo_cm:.2f} cm")

print()
print("Se usaron 5 fórmulas diferentes")
