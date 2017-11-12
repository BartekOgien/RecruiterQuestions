package com.recruiter.questions;

import java.util.ArrayList;
import java.util.List;

public class QuestDB {
    private List<QuestionAndAnswer> questions = new ArrayList<>();

    public void createQuestionsList() {
        questions.add(new QuestionAndAnswer("Czym jest String w Javie?", "String jest to klasa, która została zdefiniowana w pakiecie java.lang.\n Warto też zauważyć, iż nie jest " +
                "to prymitywny typ danych (prymitywy zaczynają się z małej litery).\n Jest niezmienny oraz (zazwyczaj) " +
                "przechowywany w puli ciągów znaków (String pool)."));
        questions.add(new QuestionAndAnswer("Dlaczego String jest niezmienny?", "Po pierwsze, jest to spowodowane:\n" +
                "\n" +
                "Bezpieczeństwem – jeżeli w aplikacji występują połączenia (przedstawiane za pomocą Stringa), \ndane użytkowników (nazwy użytkowników, hasła),\n połączenia z bazami danych, to w przypadku gdy String mógłby być modyfikowany łatwość zmiany tych parametrów stanowiłaby zagrożenie bezpieczeństwa.\n" +
                "Synchronizacja (w programowaniu wielowątkowym) – skoro String jest niezmienny to automatycznie rozwiązuje to problem z synchronizacją.\n" +
                "Zarządzanie Pamięcią – kompilator widzi kiedy dwa obiekty typu String posiadają tą samą wartość. \nDzięki temu możliwa jest optymalizacja – wystarczy jeden obiekt aby reprezentować dwie zmienne."));
        questions.add(new QuestionAndAnswer("Co to jest polimorfizm?", "Polimorfizm (inaczej: wielopostaciowość) to cecha programowania obiektowego, polegająca na tym,\n że obiekty mogą być postrzegane pod różnymi postaciami - jako obiekty klas, według których je utworzono,\n ale również jako obiekty ich klas nadrzędnych (w rozumieniu dziedziczenia). Mając klasę ogólną Figura i dziedziczącą z niej klasę Kwadrat, możemy powiedzieć,\n" +
                " że obiekt kwadrat jest klasy Kwadrat, ale również możemy powiedzieć, że jest klasy Figura."));
        questions.add(new QuestionAndAnswer("Co to jest Bean?", "Bean to dowolny obiekt, którego cyklem życia (tworzeniem, wstrzykiwaniem zależności, wstrzykiwaniem jego jako zależność itd.)\n zarządza framework bazujący na Dependency Injection, w szczególności framework Spring.\n" +
                "\n" +
                "Czyli mówiąc prosto - jeżeli Spring utworzy obiekt w oparciu o\n nasze klasy, to przez sam ten fakt staje się on Beanem"));
        questions.add(new QuestionAndAnswer("Co to jest Klasa a co obiekt?", "Klasa to właśnie pewna matryca do tworzenia\n obiektów na bazie tego wzorca.\n" +
                "Tworzenie szablonu/matrycy dla obiektów w postaci klasy i wykorzystywanie ich w dalszej części \ntworzenia programu jest nazywane podejściem obiektowym" +
                "\n Obiekt to wystąpienie danej klasy, może być ich tworzonych wiele na bazie jednej klasy, \nklasa określa pewną konstrukcję obiektu, a sam obiekt jest bytem, który ma pewne specyficzne dane, odróżniające go od innych obiektów.\n" +
                ""));
        questions.add(new QuestionAndAnswer("Co to jest metoda?","Metoda jest niczym innym jak zbiorem możliwych do wykonania akcji przez obiekt\n stworzony na podstawie klasy, która te metody zawiera. Te akcje to zbiór instrukcji w danej metodzie, które są uruchamiane kiedy ta metoda zostanie wywołana, np. w innym miejscu w kodzie.\n" +
                ""));
        questions.add(new QuestionAndAnswer("Co to jest dziedziczenie?","Dziedziczenie w podejściu obiektowym spełnia bardzo ważną rolę\n jak możliwość wydzielenia części wspólnych klas, aby nie powielać wcześniej już napisanego kodu. \nInaczej mówiąc stosujemy tu pewną reużywalność\n" +
                " wytworzonych elementów programu. Taka konwencja pozwala na użycie kodu do\n obsługi nowych przypadków. Ma to na celu wyodrębnienie w klasie nadrzędnej wspólnych atrybutów, które mogą być dziedziczone przez klasy \nniżej. Oprócz atrybutów możemy dziedziczyć także metody. "));
    }

    public List<QuestionAndAnswer> getQuestions() {
        return questions;
    }
}
