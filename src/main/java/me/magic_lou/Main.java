package me.magic_lou;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Question> questions = new LinkedList<>();

        Question q1 = new Question(1, "Warum wird bei der Vornahme eines C-Rohrs eine Schlauchreserve verlegt?",
                List.of("Damit zusätzlich ein weiteres Rohr vorgenommen werden kann",
                        "Damit sich der Trupp möglichst weit entfernt vom Brandherd aufstellen kann",
                        "Damit der Trupp, der das Rohr einsetzt, beweglich bleibt",
                        "Damit kein Verteiler gebraucht wird"),
                List.of(3));
        questions.add(q1);


        Question q2 = new Question(2, "Für welche Zwecke werden C-Druckschläuche vorwiegend verwendet?",
                List.of("Leitungen zwischen Hydrant und Feuerlöschkreiselpumpe",
                        "Wasserförderung über lange Schlauchstrecken",
                        "Auffüllen der Kübelspritze",
                        "Löschangriff"),
                List.of(4));
        questions.add(q2);

        Question q3 = new Question(3, "Welche Aufgaben hat der Melder in einer Löschgruppe?",
                List.of("Immer am Funkgerät bleiben",
                        "Besondere Aufgaben übernehmen",
                        "Vornahme des ersten C-Rohrs",
                        "Nachrichten, Befehle und Rückmeldungen übermitteln"),
                List.of(2, 4));
        questions.add(q3);

        Question q4 = new Question(4, "Wie werden Feuerlöschschläuche grundsätzlich eingeteilt?",
                List.of("Angriffs- und Verteidigungsschläuche",
                        "Druck- und Saugschläuche",
                        "Weiße und rote Schläuche",
                        "Kurze und lange Schläuche"),
                List.of(2));
        questions.add(q4);

        Question q5 = new Question(5, "Für welche brennbaren Stoffe ist Wasser ohne Einschränkung als Löschmittel geeignet?",
                List.of("Überhitztes Fett",
                        "Holz",
                        "Benzin",
                        "Teer",
                        "Metalle",
                        "Gase"),
                List.of(2));
        questions.add(q5);

        Question q6 = new Question(6, "Unter welchen Voraussetzungen dürfen Feuerwehranwärter ab 16 Jahren bei Einsätzen zu Hilfeleistungen herangezogen werden?",
                List.of("Aufsicht eines erfahrenen Feuerwehrdienstleistenden außerhalb des Gefahrenbereiches",
                        "Mitführen einer Handlampe",
                        "Tragen einer Warnweste"),
                List.of(1));
        questions.add(q6);

        Question q7 = new Question(7, "Was bedeutet die Bezeichnung TSF?",
                List.of("Transportfahrzeug für Feuerwehrdienstleistende",
                        "Löschgruppenfahrzeug",
                        "Tankspritzenfahrzeug",
                        "Tragkraftspritzenfahrzeug"),
                List.of(4));
        questions.add(q7);

        Question q8 = new Question(8, "Wer ist der „Träger” der Freiwilligen Feuerwehr (Aufstellung, Ausrüstung und Unterhalt)?",
                List.of("Der Kommandant",
                        "Der Landkreis",
                        "Die Gemeinde",
                        "Der Feuerwehrverein"),
                List.of(3));
        questions.add(q8);

        Question q9 = new Question(9, "Wieviele Feuerwehrdienstleistende sind zur Vornahme eines B-Rohrs mit Stützkrümmer mindestens erforderlich?",
                List.of("4 Feuerwehrdienstleistende",
                        "3 Feuerwehrdienstleistende",
                        "2 Feuerwehrdienstleistende",
                        "1 Feuerwehrdienstleistender"),
                List.of(3));
        questions.add(q9);

        Question q10 = new Question(10, "Wo wird das erste C-Rohr am Verteiler angeschlossen?",
                List.of("Links",
                        "Rechts",
                        "In der Mitte",
                        "Am B-Eingang"),
                List.of(1));
        questions.add(q10);

        Question q11 = new Question(11, "Wo wird die Schlauchreserve verlegt?",
                List.of("Am Verteiler",
                        "An der Feuerlöschkreiselpumpe",
                        "In der Mitte zwischen Verteiler und Strahlrohr",
                        "Direkt beim vorgehenden Trupp"),
                List.of(4));
        questions.add(q11);

        Question q12 = new Question(12, "Aufgaben der Feuerwehr?",
                List.of("Brandbekämpfung",
                        "Hilfe bei Gefahrgutunfällen",
                        "Abschleppen von Kraftfahrzeugen",
                        "Technische Hilfe bei Unfällen",
                        "Retten von Menschen",
                        "Hilfe bei Katastrophen"),
                List.of(1, 2, 4, 5, 6));
        questions.add(q12);

        Question q13 = new Question(13, "Aus wievielen Feuerwehrdienstleistenden besteht eine Staffel?",
                List.of("2 Feuerwehrdienstleistende",
                        "3 Feuerwehrdienstleistende",
                        "6 Feuerwehrdienstleistende",
                        "9 Feuerwehrdienstleistende"),
                List.of(3));
        questions.add(q13);

        Question q14 = new Question(14, "Welche Stoffe sind brennbar?",
                List.of("Papier",
                        "Holz",
                        "Stein",
                        "Kunststoff"),
                List.of(1, 2, 4));
        questions.add(q14);

        Question q15 = new Question(15, "Warum werden beim Verlegen der Schläuche Schlauchhaspeln oder Schlauchtragekörbe verwendet?",
                List.of("Schnelleres verlegen der Schlauchleitung, wenn mehr als ein Schlauch erforderlich ist",
                        "Damit bereits während des Verlegens der Schlauchleitung Wasser auf die Leitung gegeben werden kann",
                        "Damit die Schlauchreserve in der für den Angriffstrupp verlegten Schlauchleitung entfallen kann",
                        "Leichterer Transport mehrerer Schläuche"),
                List.of(1, 4));
        questions.add(q15);

        Question q16 = new Question(16, "Wie werden bewusstlose Personen gelagert?",
                List.of("Oberkörper hochlegen",
                        "Stabile Seitenlage",
                        "Sitzende Lagerung",
                        "Auf dem Rücken liegend"),
                List.of(2));
        questions.add(q16);

        Question q17 = new Question(17, "Wie sind die Rohre an einem Verteiler anzuschließen?",
                List.of("Erstes C-Rohr links, zweites C-Rohr rechts",
                        "Erstes C-Rohr rechts, zweites C-Rohr links",
                        "Drittes C-Rohr/Schaumrohr links oder rechts",
                        "Drittes C-Rohr/Schaumrohr in der Mitte"),
                List.of(1, 4));
        questions.add(q17);

        Question q18 = new Question(18, "Welche Wassermenge liefert in etwa ein CM-Strahlrohr mit Mundstück (5 bar Strahlrohrdruck)?",
                List.of("400 l/min",
                        "200 l/min",
                        "100 l/min",
                        "50 l/min"),
                List.of(3));
        questions.add(q18);

        Question q19 = new Question(19, "Welche Aufgaben dürfen Feuerwehranwärter, die das 16. Lebensjahr vollendet und die Feuerwehr-Grundausbildung abgeschlossen haben, bei Einsätzen ausführen?",
                List.of("Mitwirkung beim Aufbau von Schlauchleitungen außerhalb des unmittelbaren Gefahrenbereiches",
                        "Retten von Personen über Feuerwehrleitern",
                        "Einsatz von B-Rohren",
                        "Technische Rettungsmaßnahmen zur Befreiung einer Person aus einem Pkw"),
                List.of(1));
        questions.add(q19);

        Question q20 = new Question(20, "Welche Gegenstände sind beim Aufbau der Wasserversorgung aus einem Unterflurhydranten erforderlich?",
                List.of("Druckbegrenzungsventil",
                        "Standrohr",
                        "B-Schläuche",
                        "Unterflurhydrantenschlüssel",
                        "Zumischer",
                        "Mehrzweckleine"),
                List.of(2, 3, 4));
        questions.add(q20);

        Question q21 = new Question(21, "Welcher Trupp ist beim Einsatz der Gruppe vorrangig für die Wasserversorgung bis zum Verteiler verantwortlich (Regelfall)?",
                List.of("Angriffstrupp",
                        "Wassertrupp",
                        "Schlauchtrupp"),
                List.of(2));
        questions.add(q21);

        Question q22 = new Question(22, "Wofür wird die Kübelspritze verwendet?",
                List.of("Sichern des Atemschutztrupps",
                        "Speicher in Schlauchleitungen",
                        "Löschen von brennbaren Gasen",
                        "Löschen von Papierkorbbrand"),
                List.of(4));
        questions.add(q22);
        Question q23 = new Question(23, "Was sind die Aufgaben des Angriffstrupps beim Löscheinsatz einer Gruppe (Regelfall) mit Bereitstellung?",
                List.of("Schlauchbrücken auslegen",
                        "C-Schläuche für den Wassertrupp verlegen",
                        "Retten und Vornahme des ersten Rohrs nach Befehl des Gruppenführers",
                        "Wasserentnahme herrichten",
                        "Wassertrupp beim Aufbau der Schlauchleitungen unterstützen"),
                List.of(3));
        questions.add(q23);

        Question q24 = new Question(24, "Wo dürfen Feuerwehranwärter, die das 16. Lebensjahr vollendet haben, eingesetzt werden?",
                List.of("Ohne Einschränkung",
                        "Direkt am Brandherd",
                        "Direkt am verunfallten Fahrzeug",
                        "Unter Einhaltung weiterer Kriterien außerhalb des Gefahrenbereiches"),
                List.of(4));
        questions.add(q24);

        Question q25 = new Question(25, "Wie werden einsatzbereite Druckschläuche in Feuerwehrfahrzeugen aufbewahrt?",
                List.of("Am Boden des Mannschaftsraumes",
                        "Als Rollschläuche in den eigentlich für tragbare Schlauchhaspel vorgesehenen Fächern",
                        "Als einfach gerollte Schläuche in Fächern",
                        "In Schlauchtragekörben oder auf Schlauchhaspeln"),
                List.of(4));
        questions.add(q25);

        Question q26 = new Question(26, "Welche Teile gehören unbedingt zur persönlichen Schutzausrüstung der Feuerwehranwärter?",
                List.of("Krawatte",
                        "Feuerwehrhelm/Jugendschutzhelm",
                        "Feuerwehrstiefel/festes Schuhwerk",
                        "Feuerwehraxt",
                        "Schutzhandschuhe",
                        "C-Schlauch"),
                List.of(2, 3, 5));
        questions.add(q26);

        Question q27 = new Question(27, "Wozu ist ein Standrohr erforderlich?",
                List.of("Zur Wasserentnahme aus Unterflurhydranten",
                        "Zur Wasserentnahme aus Überflurhydranten",
                        "Zur Wasserentnahme aus flachem Gewässer",
                        "Zum Zumischen von Schaummittel"),
                List.of(1));
        questions.add(q27);

        Question q28 = new Question(28, "Wann muss der Feuerhelm getragen werden?",
                List.of("Unterricht",
                        "Einsatzübung",
                        "Brandeinsatz",
                        "Fahrzeugpflege"),
                List.of(2, 3));
        questions.add(q28);

        Question q29 = new Question(29, "Welches Löschgerät soll bei einem kleineren Entstehungsbrand in einem Zimmer, z. B. Brand eines Papierkorbes, eingesetzt werden?",
                List.of("Kohlendioxidlöscher",
                        "Kübelspritze",
                        "B-Rohr",
                        "Schaumrohr"),
                List.of(2));
        questions.add(q29);

        Question q30 = new Question(30, "Wo werden die Feuerwehrleinen aufbewahrt?",
                List.of("Im Feuerwehrleinenbeutel im Mannschaftsraum der Feuerwehrfahrzeuge",
                        "Auf dem Dach der Feuerwehrfahrzeuge",
                        "In besonderen Gerätekisten",
                        "Aufgewickelt im Feuerwehrfahrzeug am Pumpenbedienstand"),
                List.of(1));
        questions.add(q30);

        Question q31 = new Question(31, "Wer bestimmt die Lage des Verteilers?",
                List.of("Maschinist",
                        "Gruppenführer",
                        "Angriffstruppführer",
                        "Schlauchtruppführer"),
                List.of(2));
        questions.add(q31);

        Question q32 = new Question(32, "Welche Tätigkeiten dürfen und sollen Feuerwehranwärter ausführen?",
                List.of("Schwere Lasten tragen",
                        "An Ausbildungsveranstaltungen teilnehmen",
                        "Spreizer im Einsatz vornehmen",
                        "Angriffstrupp bei Brandeinsätzen"),
                List.of(2));
        questions.add(q32);

        Question q33 = new Question(33, "Sie sind bei einer Übung als Wassertruppführer eingeteilt. Was tun Sie zu Beginn der Übung?",
                List.of("Sofort Wasserversorgung aufbauen",
                        "Am Verteiler bereitstellen",
                        "Einsatzbefehl des Gruppenführers abwarten",
                        "Sofort zum angenommenen Brandherd vorgehen"),
                List.of(3));
        questions.add(q33);

        Question q34 = new Question(34, "Wofür sind Mehrzweckleinen vorgesehen?",
                List.of("Absperren von Gefahrenbereichen",
                        "Sichern der Saugleitung",
                        "Abschleppen von Fahrzeugen",
                        "Retten und Selbstretten"),
                List.of(1, 2));
        questions.add(q34);

        Question q35 = new Question(35, "Welche Schalterstellungen hat ein genormtes CM-Strahlrohr?",
                List.of("Halt, Vollstrahl",
                        "Halt, Sprühstrahl",
                        "Vollstrahl, Sprühstrahl",
                        "Vollstrahl, Halt, Sprühstrahl"),
                List.of(4));
        questions.add(q35);

        Question q36 = new Question(36, "Wie sollten gebrauchte, nasse Schläuche transportiert werden?",
                List.of("Nicht gerollt",
                        "Einfach gerollt",
                        "Doppelt gerollt"),
                List.of(2));
        questions.add(q36);

        Question q37 = new Question(37, "Wer bestimmt den Einsatz eines zweiten C-Rohres?",
                List.of("Angriffstruppführer",
                        "Wassertruppführer",
                        "Gruppenführer",
                        "Melder"),
                List.of(3));
        questions.add(q37);

        Question q38 = new Question(38, "Für welche Zwecke werden B-Schläuche vornehmlich verwendet?",
                List.of("Schnellangriffseinrichtung",
                        "Löschen von kleinen Bränden",
                        "Angriff bei großem Wasserbedarf",
                        "Wasserförderung (Transport)"),
                List.of(3, 4));
        questions.add(q38);

        Question q39 = new Question(39, "Was ist zur Inbetriebnahme eines Überflurhydranten erforderlich?",
                List.of("Überflurhydrantenschlüssel",
                        "Verteiler",
                        "Druckbegrenzungsventil",
                        "Standrohr"),
                List.of(1));
        questions.add(q39);

        Question q40 = new Question(40,"Wer baut beim Einsatz der Löschgruppe die Saugleitung auf (Regelfall)?",
                List.of("Schlauchtrupp, Angriffstrupp",
                        "Wassertrupp, Schlauchtrupp",
                        "Wassertrupp, Angriffstrupp",
                        "Maschinist, Melder, Angriffstrupp"),
                List.of(2));
        questions.add(q40);


        GUI gui = new GUI(questions);



    }
}