# Bojan Nastovski 173121

# Control Flow Graph
![control-flow.png](control-flow.png)

# Cyclomatic Complexity

Treba da se odzemat brojot na jazli od brojot na rebra i da se dodade 2. <br />
broj na rebra = 39 <br />
broj na jazli = 30 <br />
39 - 30 + 2 = 11 <br />
Ciklomatskata kompleksnost na grafot e 11.

# Every Branch

![branch1.png](branch1.png)
![branch2.png](branch2.png)

1.  Celta na prviot test e da se frli isklucok, a so toa da se pominat grankite od prviot if
2.  Celta na vtoriot test e da se izminat grankite vo for ciklucot kade ke se ispolni uslovot deka vo listata ima korisnik so ist username kako i vlezniot korisnik. Potoa da se izleze od programot so return false poradi toa sto lozinkata e pomala od 8 karakteri
3.  Celta e da se izmine onoj if vor for ciklusot koj proveruva dali emailot na vlezniot korisnik e zafaten od drug user, a potoa poradi toa sto pasvordot e validen da se vleze vo dolniot for ciklus no da se izleze kaj return same == 0 so false poradi toa sto ima eden korisnik so ist email
4.  Celta e da se izmine if uslovot kade se proveruva dali vlezniot user nema username i da se postavi negoviot email kako username, potoa poradi toa sto passwordot nema specijalni karakteri da se izmine grankata od V do Y.
5.  Celta e da se dade nevaliden email
6.  Celta e da se dade password koj sodrzi " " vo nego i da se izmine grankata U-Y

# Multiple Condition

![multiple.png](multiple.png)

Ovde se testira if uslovot so 4 razlicni testovi: (T,X,X), (F,T,X), (F,F,T), (F,F,F). Tuka so Lazy Evaluation se spojuvaat (T,T,T), (T,F,T), (T,T,F), (T,F,F) vo (T,X,X) i (F,T,T), (F,T,F) vo (F,T,X).

## Unit tests
Za sekoj od test primerite dodavam po eden unit test. <br />
Testot 1 treba da mmi vrati Runtime Exception pa zatoa dodavam assertThrows za toj test. <br />
Testot 2 treba da mi vrati false, pa zatoa koristam assertFalse. <br />
Istoto vazi i za ostanatite testovi.
