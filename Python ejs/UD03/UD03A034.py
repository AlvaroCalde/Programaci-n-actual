mes=int(input("Introduzca mes: "))

if mes>=1 and mes<=12:
    match mes:
        case 1,3,5,7,8,10,12:
            print("Tiene 31 días")
        case 2:
            print("Tiene 28 días")
        case 4,6,9,11:
            print("Tiene 30 días")