package com.recruiter.questions;

import com.recruiter.questions.QuestionAndAnswer;

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
                "Bezpieczeństwem – jeżeli w aplikacji występują połączenia (przedstawiane za pomocą Stringa), dane użytkowników (nazwy użytkowników, hasła),\n połączenia z bazami danych, to w przypadku gdy String mógłby być modyfikowany łatwość zmiany tych parametrów stanowiłaby zagrożenie bezpieczeństwa.\n" +
                "Synchronizacja (w programowaniu wielowątkowym) – skoro String jest niezmienny to automatycznie rozwiązuje to problem z synchronizacją.\n" +
                "Zarządzanie Pamięcią – kompilator widzi kiedy dwa obiekty typu String posiadają tą samą wartość. Dzięki temu możliwa jest optymalizacja – wystarczy jeden obiekt aby reprezentować dwie zmienne."));
        questions.add(new QuestionAndAnswer("Co to jest polimorfizm?", "Polimorfizm (inaczej: wielopostaciowość) to cecha programowania obiektowego, polegająca na tym,\n że obiekty mogą być postrzegane pod różnymi postaciami - jako obiekty klas, według których je utworzono,\n ale również jako obiekty ich klas nadrzędnych (w rozumieniu dziedziczenia). Mając klasę ogólną Figura i dziedziczącą z niej klasę Kwadrat, możemy powiedzieć,\n" +
                " że obiekt kwadrat jest klasy Kwadrat, ale również możemy powiedzieć, że jest klasy Figura."));
        questions.add(new QuestionAndAnswer("Co to jest Bean?", "Bean to dowolny obiekt, którego cyklem życia (tworzeniem, wstrzykiwaniem zależności, wstrzykiwaniem jego jako zależność itd.)\n zarządza framework bazujący na Dependency Injection, w szczególności framework Spring.\n" +
                "\n" +
                "Czyli mówiąc prosto - jeżeli Spring utworzy obiekt w oparciu o nasze klasy, to przez sam ten fakt staje się on Beanem"));
    }

    public List<QuestionAndAnswer> getQuestions() {
        return questions;
    }
}
