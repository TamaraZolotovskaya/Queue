# Учебная задача, работа с Queue

<i>Задание</i><br>
Подходя к кассе супермаркета, мы выбираем очередь, в которой меньше всего людей. Когда становится слишком много людей, один из сотрудников вызывает Галю, открывающую дополнительную кассу.

Напишите программу, в которой имитируется данное поведение.

Создайте 2 очереди (Queue<String>) с максимальной размерностью 5. Заполните обе очереди случайным количеством элементов (от 0 до 5 — для каждой очереди свой случайный элемент). В качестве значения используйте имя человека в этой очереди (можно использовать любую строку/строки).

Напишите новый метод, принимающий строку (имя человека), который добавляет человека в очередь, где меньше всего людей. Если обе очереди заполнены, выведите в консоль просьбу позвать Галю.

Напишите еще один метод, при вызове которого удаляется человек из случайной очереди.
