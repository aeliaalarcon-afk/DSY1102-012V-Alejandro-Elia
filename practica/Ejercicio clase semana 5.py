while True:
    try:
        numero = int(input("Ingresa un número entero positivo: "))

        if numero > 0:
            break

        print("Error: el número debe ser mayor que 0.")

    except ValueError:
        print("Error: debes ingresar un entero, sin letras ni decimales.")

print("Número válido:", numero)