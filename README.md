# Beguage Programming Language
***User Manual***

Autorzy:
1. *Michał Tomczyk*
2. *Marcin Łomiński*
## 1. Wstęp
> Genesis 1:3-25 KJV
>> *And God said, **Let there be light:** and there was light.*

*Beguage* to prosty język programowania z kompilatorem zaimplementowanym w technologii ANTLR+LLVM. Na tle innych języków wyróżnia się wyjątkową deklaracją zmiennych.

Projekt tego języka został wykonany na potrzeby zaliczenia kursu 1DI2152 - Języki formalne i kompilatory. Obejmuje wszystkie etapy przetwarzania kodu źrodłowego, aż do utworzenia kodu maszynowego.

Przód kompilatora, obejmujący analizę leksykalną i składniową, został wykonany przy użyciu generatora analizatorów ANTLR. Z wynikowego drzewa składniowego (AST) została wygenerowana reprezentacja pośrednia (IR) zgodna ze specyfikacją LLVM. Optymalizacja reprezentacji pośredniej, a także generowanie kodu maszynowego jest realizowane przy użyciu narzędzi dostępnych w LLVM.

Projekt został podzielony na dwa etapy, wykorzystując technologie ANTLR i LLVM.
**Etap 1. Proste operacje na zmiennych (15 pkt)**
Wymagania minimalne (10 pkt):
- obsługa dwóch typów zmiennych: całkowite, rzeczywiste, **DONE**
- podstawowa obsługa standardowego wejścia-wyjścia (np. polecenia read i print), **DONE**
- obsługa podstawowych operacji artmetycznych, **DONE**
- wskazywanie błędów podczas analizy leksykalno-składniowej﻿. **DONE**

**Rozszerzenia:**
- obsługa zmiennych tablicowych (3 pkt),
- obsługa macierzy liczb (5 pkt),
- obsługa wartości logicznych (2pkt za AND, OR, XOR, NEG, 5p. jeżeli zaimplementowane zostanie short-circuit boolean evaluation),
- obsługa liczb o różnej precyzji (np. Float32, Float64) (5 pkt), **DONE**
- obsługa typu ciąg znaków (string) (3 pkt)﻿.

**Etap 2. Sterowanie przepływem programu (15 pkt)**
Wymagania minimalne (10 pkt):
- instrukcja warunkowe, pętla, **DONE**
- możliwość tworzenia funkcji, **DONE**
- obsługa zasięgu zmiennych (lokalne i globalne) **DONE**

**Rozszerzenia:**
- obsługa struktur (5 pkt)﻿,
- obsługa klas (5 pkt),
- dynamiczne typowanie (wartości w pudełkach) (5 pkt),
- funkcje-generatory (jak funkcje wykorzystujące yield w Python) (5 pkt).

## 2. Proste operacje na zmiennych

### Obsługiwane są następujące typy zmiennych:
- całkowite (Int) --> i32
- 32-bitowe liczby zmiennoprzecinkowe (Float32) --> f32
- 64-bitowe liczby zmiennoprzecinkowe (Float64) --> f64

### Deklaracja zmiennych:
Co wyróżnia *Beguage* to m.in. wyjątkowa deklaracja zmiennych: `let x be 10`.
- `let` jest predeklaracją zmiennej - w ten sposób rozpoczyna się deklarację,
- `be` jest równoznaczne ze znakiem "=".

### Operacja wczytania zmiennej z klawiatury:
Operacja wczytania wartości z klawiatury: `provide x`
- `provide` jest analogiczną instrukcją do `input`, `cin >>`.

### Operacja wypisania zmiennej:
Operacja wypisania zmiennej odbywa przy pomocy instrukcji: `show x`
- `show` jest analogiczną instrukcją do `print()`, `cout <<`.

### Operacje arytmetyczne:
- **DODAWANIE** - odbywa się przy pomocy znaku dodawania (+) `x + y`
- **ODEJMOWANIE** - odbywa się przy pomocy znaku odejmowania (-) `x - y`
- **MNOŻENIE** - odbywa się przy pomocy znaku gwiazdki (*) `x * y`
- **DZIELENIE** - odbywa się przy pomocy znaku ukośnika (/) `x / y`

### Przykładowy kod:
```
let x be 10
let y be f2.5
provide z
show x + y
show x - y
show x * y
show x / y
show x + y * x / y
```
### Wynik powyższego kodu:
oczekawianie na input _
```
12.5
7.5
25.0
4.0
20.0
```
