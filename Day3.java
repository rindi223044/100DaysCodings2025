# Fungsi untuk mengecek apakah sebuah angka adalah bilangan prima
def cek_prima(angka):
    # Bilangan kurang dari 2 bukan bilangan prima
    if angka < 2:
        return False
    
    # Cek faktor dari 2 sampai akar dari angka
    for i in range(2, int(angka ** 0.5) + 1):
        if angka % i == 0:
            return False  # Jika habis dibagi, berarti bukan prima
    return True  # Jika tidak ada pembagi, berarti prima

# Contoh penggunaan fungsi
bilangan = 17
if cek_prima(bilangan):
    print(f"{bilangan} adalah bilangan prima.")
else:
    print(f"{bilangan} bukan bilangan prima.")
