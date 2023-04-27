Solved tasks
------------

Internship Yandex 2023 \\ Backend (Competitions)


A. Лучше клавиатуры не сыскать?

Начало условия: Кузя снова не успел сдать реферат по языковым разнообразиям в срок. «Наверное, у меня какая-то неоптимальная клавиатура...» — подумал Кузя и решил изобрести самую оптимальную клавиатуру для набора одним пальцем.
Кузя решил, что его клавиатура будет содержать
N
рядов с клавишами (разные ряды могут содержать разные количества клавиш). Все клавиши на клавиатуре будут уникальными.
Чтобы оценить качество клавиатуры для набора определённого текста, Кузя ввёл понятие «разнорядности»:

B. Горе от перфекционизма

Начало условия: К Новому-преновому году работники Тындекса построили N ледяных скульптур, i-я скульптура состоит из a_i килограмм льда.
Но они не посоветовались с Кузей! А ведь Кузя знает, что идеальная скульптура состоит из ровно X килограмм льда, не больше и не меньше.
Новый-преновый год уже совсем скоро, до него осталось всего T минут. За одну минуту Кузя может выбрать одну скульптуру и добавить или удалить ровно 1 килограмм льда из неё.
Вас, как отличника художественной школы, Кузя просит найти максимальное количество идеальных скульптур в момент наступления праздника.



Internship Yandex 2022 \\ Backend  (Past Competitions)

A. Числовые ребусы

Начало условия: Алиса изучает английский язык. Ей надоела обычная речь, поэтому она решила говорить числовыми ребусами:
1. Каждой строчной букве латинского алфавита Алиса сопоставила двоичный разряд, начиная с младшего: a — 0-й разряд, b — 1-й,
   ... , z — 25-й.
2. Чтобы произнести букву, Алиса инвертирует соответствующий букве бит в специальной переменной W и сообщает новое значение
   W в десятичной системе.
   Определение: инверсия бита j в числе x — изменение значения j-го разряда числа x в двоичной системе на противоположное (0
   становится 1, 1 становится 0).
   Пример: число 15 (1111) после инверсии бита 2 становится равным числу 11 (1011).
3. Также Алиса произносит пробел, используя для этого 26-й разряд.
   Значение переменной W перед произнесением Алисой первого символа равно 0.
   Напишите программу, которая переведет сказанный Алисой числовой ребус.
   Примечание: Алиса использует пробел наравне с буквами латинского алфавита — для пробела не существует дополнительных
   ограничений и условий для его произнесения.


B. Шестиугольники

Начало условия: На клетчатом поле нарисовали некоторую картину, состоящую из одинаковых шестиугольников.
Шестиугольники, из которых состоит картина, задаются с помощью следующих символов:
Нижнее подчеркивание (_) для верхней и нижней стороны.
Слеш (/) для верхней левой и нижней правой стороны.
Обратный слеш (\) для верхней правой и нижней левой стороны.
Любая заглавная латинская буква (например, X) в центре шестиугольника.
Ниже представлен пример шестиугольника:
.....
.._..
./X\.
.\_/.
.....
Нарисованные шестиугольники не пересекаются и не накладываются друг на друга, но могут иметь общую сторону (см. примеры).
Картина вписывается в клетчатое поле с наименьшими возможными высотой и шириной. После этого добавляется первая и последняя
строка, и первый и последний столбец, состоящие из символов . (точка). Все клетки, которые не содержатся в картине, также
заполняются символом . (точка).
Вам необходимо отразить поле с шестиугольниками по вертикали и горизонтали, после чего вывести итоговое отраженное поле.


D. Двоичная медиана

Начало условия: Дана строка S длины N, состоящая только из 0 и 1. Для каждого R от 1 до N необходимо найти любой индекс 1 ≤ L < R такой, что
SR является медианой подстроки S [L ... R].
Определение: медиана строки S, состоящей только из 0 и 1, определяется следущим образом:
обозначим за C0 количество 0 в строке S; аналогично C1 — количество 1.
пусть C0 > C1 — в таком случае медианой является 0; аналогично при C0 < C1 медианой является 1.
в случае C0 = C1 медианой считается значение 0. 5 (в рамках данной задачи достаточно знать, что данная медиана не равна ни
0, ни 1)


E. Пересечения прямоугольников

Дан набор прямоугольников на плоскости со сторонами, параллельными осям координат.
Для каждого прямоугольника необходимо вычислить количество других прямоугольников, с которыми данный прямоугольник
пересекается.
Определение: два прямоугольника пересекаются, если существует область ненулевой площади, принадлежащая обоим
прямоугольникам. Внешнее касание по стороне образует общую область нулевой площади, поэтому пересечением не является.


Training context Yandex 2022 \\ Backend (Past Competitions)

Андрей и кислота

Начало условия: Андрей работает в секретной химической лаборатории, в которой производят опасную кислоту с удивительными свойствами.
У Андрея есть n бесконечно больших резервуаров, расположенных в один ряд. Изначально в каждом резервуаре находится некоторое количество кислоты.
Начальство Андрея требует, чтобы во всех резервуарах содержался одинаковый объем кислоты. К сожалению, разливающий аппарат несовершенен.
За одну операцию он способен разлить по одному литру кислоты в каждый из первых k (1 ≤ k ≤ n) резервуаров. Обратите внимание, что для разных операций k могут быть разными.
Поскольку кислота очень дорогая, Андрею не разрешается выливать кислоту из резервуаров. Андрей просит вас узнать, можно ли уравнять объемы кислоты в резервуарах, и, если это возможно,
то посчитать минимальное количество операций, которое потребуется, чтобы этого достичь.
