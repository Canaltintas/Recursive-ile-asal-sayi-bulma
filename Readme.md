# Patika.dev
Patika.dev Profil : https://app.patika.dev/cans06

# Ödev - Asal Sayı Bulan Program
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

## Programın Çalışması
Metotun temel mantığı 1 ve kendisi arasında ki sayılara tam bölünmüyorsa true,bölünüyorsa false değeri döndürmesidir.
* İki parametreli bir metot yazılır. 1. parametre kontrol edilecek sayı , ikinci parametre ise sayının bir eksiğidir.(bir eksiği olmasının sebebi sayı kendisine bölüneceği için program false değeri döndürmesinin önüne geçmektir)
* Metota bir sayı > 1'den koşulu yazılır. sayı 1'den büyükse işlemler yapılır. değilse false değeri döndürür.(Asal sayı olma şartı ;bir sayının yalnızca iki pozitif böleni olmasıdır.)
* ikinci bir koşul olarak ikinci parametrenin 1'den farklı olası koşuludur.(burada ise her sayı 1'e tam bölüneceği için false değeri döndürmesinin önüne geçmektir)
* a%b !=0 ise metot b'değerinin 1 eksiğiyle tekrar kendini çağırır. değilse false değeri döner.b değeri 1 olana kadar işlem tekrarlanır.
* 1 ile a arasında hiç bir sayı tam bölünmüyorsa true değeri döndürülür.

