import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

interface  Topics {
    String[] topics = {
        "Football",
        "Music",
        "Science",
        "Movie",
        "Nobel Prize",
        "History",
        "Esport",
        "Book",
        "Coding",
        "Badminton",
        "Poetry",
        "Animal",
        "Car",
        "Olympic",
        "War"
    };
    String Question();
    String[] Answer();
}

class Football implements Topics {
    @Override
    public String Question() {
        return "Which football team never win the Champions League?";
    }
    public String[] Answer() {
        return new String[] {
            "Manchester United",
            "Liverpool",
            "Real Madrid",
            "Manchester City",
            "AC Milan",
            "FC Barcelona",
            "Arsenal", // answer 6
            "Chelsea",
            "Juventus",
            "Bayern Munich"
        };
    }
}

class Music implements  Topics{
    @Override
    public String Question() {
        return "Who sing a song “Said I loved you … but I lied”?";
    }
    public String[] Answer() {
        return new String[] {
            "Taylor Swift",
            "Beyoncé",
            "Adele",
            "Michael Bolton", // answer 3
            "Bruno Mars",
            "Ed Sheeran",
            "Ariana Grande",
            "The Weeknd",
            "Freddie Mercury",
            "Elton John"
        };
    }
}

class Science implements Topics{
    @Override
    public String Question() {
        return "What is the primary function of the mitochondria within a eukaryotic cell?";
    }
    public String[] Answer() {
        return new String[] {
            "Protein Synthesis",
            "Storage of Genetic Information (DNA)",
            "Cellular Respiration and Energy Production (ATP)", // answer 2
            "Transport of Proteins and Lipids",
            "Photosynthesis",
            "Structural Support and Shape",
            "Digestion of Cellular Waste",
            "Cell Division and Reproduction",
            "Transport of Water and Minerals",
            "Detoxification of Poisons"
        };
    }
}

class Movie implements Topics{
    @Override
    public String Question() {
        return "Who won the Academy Award for Best Actor at the 88th Academy Awards (2016) for their performance?";
    }
    public String[] Answer() {
        return new String[] {
            "Matt Damon (The Martian)",
            "Eddie Redmayne (The Danish Girl)",
            "Michael Fassbender (Steve Jobs)",
            "Bryan Cranston (Trumbo)",
            "Leonardo DiCaprio (The Revenant)", // answer 4
            "Steve Carell (The Big Short)",
            "Will Smith (Concussion)",
            "Tom Hanks (Bridge of Spies)",
            "Benedict Cumberbatch (The Imitation Game)",
            "Bradley Cooper (American Sniper)"
        };
    }
}

class NobelPrize implements Topics{
    @Override
    public String Question() {
        return "In which category was Aung San Suu Kyi awarded the Nobel Prize?";
    }
    public String[] Answer() {
        return new String[] {
            "Nobel Prize in Physics",
            "Nobel Prize in Chemistry",
            "Nobel Prize in Medicine",
            "Nobel Prize in Literature",
            "Nobel Prize in Peace", // answer 4
            "Nobel Prize in Economics",
            "Nobel Memorial Prize in Economic Sciences",
            "Nobel Prize in Physiology",
            "Nobel Prize in Astrophysics",
            "Nobel Prize in Political Science"
        };
    }
}

class History implements Topics{
    @Override
    public String Question() {
        return "What was the name of the last royal dynasty that ruled Myanmar before it was colonized by the British?";
    }
    public String[] Answer() {
        return new String[] {
            "Taungoo Dynasty",
            "Pagan Dynasty",
            "Hanthawaddy Dynasty",
            "Ava Dynasty",
            "Konbaung Dynasty", // answer 4
            "Shan Dynasty",
            "Mon Dynasty",
            "Pyu Dynasty",
            "British Raj",
            "First Myanmar Empire"
        };
    }
}

class Esport implements Topics{
    @Override
    public String Question() {
        return "Which organization won the Dota 2 tournament known as <The International> in 2023, cementing their status as a new dynasty in the game?";
    }
    public String[] Answer() {
        return new String[] {
            "Team Spirit",
            "Tundra Esports",
            "OG",
            "Team Liquid",
            "Gaimin Gladiators", // answer 4
            "Evil Geniuses",
            "LGD Gaming",
            "Natus Vincere (Na'Vi)",
            "Virtus.pro",
            "Cloud9"
        };
    }
}

class Book implements Topics{
    @Override
    public String Question() {
        return "Who is the author of the classic 1936 American novel Gone with the Wind?";
    }
    public String[] Answer() {
        return new String[] {
            "Harper Lee",
            "F. Scott Fitzgerald",
            "Ernest Hemingway",
            "William Faulkner",
            "Margaret Mitchell", // answer 4
            "Louisa May Alcott",
            "John Steinbeck",
            "Edith Wharton",
            "Stephen Crane",
            "Willa Cather"
        };
    }
}

class Coding implements Topics{
    @Override
    public String Question() {
        return "Which keyword in Java is used to create an object?";
    }
    public String[] Answer() {
        return new String[] {
            "class",
            "object",
            "public",
            "static",
            "void",
            "new", // answer 5
            "make",
            "create",
            "instance",
            "this"
        };
    }
}

class Badminton implements Topics{
    @Override
    public String Question() {
        return "In a standard singles badminton match, what is the score a player must reach to win a game?";
    }
    public String[] Answer() {
        return new String[] {
            "15 points",
            "20 points",
            "21 points", // answer 2
            "25 points",
            "30 points",
            "2 points clear",
            "15 points for women, 20 for men",
            "It depends on the tournament",
            "Best of 3 sets",
            "First to 30"
        };
    }
}

class Poetry implements Topics{
    @Override
    public String Question() {
        return "Complete the closing line of the popular modern poem: <You say you love the rain, but you open your umbrella. You say you love me too...>";
    }
    public String[] Answer() {
        return new String[] {
            "...so let's run away together.",
            "...and my heart soars with joy.",
            "...that is why I am afraid.", // answer 2
            "...but your actions speak louder.",
            "...you must love all of me.",
            "...your words are a sweet song.",
            "...so prove that it is true.",
            "...my love will never fade.",
            "...and I believe you completely.",
            "...the sun will shine again."
        };
    }
}

class Animal implements Topics{
    @Override
    public String Question() {
        return "Which of these is the only mammal capable of true, sustained flight?";
    }
    public String[] Answer() {
        return new String[] {
            "Ostrich",
            "Flying Squirrel",
            "Penguin",
            "Bat", // answer 3
            "Eagle",
            "Colugo",
            "Pterodactyl (extinct reptile)",
            "Kangaroo",
            "Hummingbird",
            "Duck"
        };
    }
}

class Car implements Topics{
    @Override
    public String Question() {
        return "Which American car manufacturer is credited with launching the first mass-produced automobile, making cars affordable for the middle class?";
    }
    public String[] Answer() {
        return new String[] {
            "Ford", // answer 0
            "Chevrolet",
            "Cadillac",
            "Dodge",
            "Chrysler",
            "Buick",
            "Oldsmobile",
            "Tesla",
            "Porsche",
            "Toyota"
        };
    }
}

class Olympic implements Topics{
    @Override
    public String Question() {
        return "In which city were the modern Olympic Games revived and held for the first time in 1896?";
    }
    public String[] Answer() {
        return new String[] {
            "Paris, France",
            "London, England",
            "Athens, Greece", // answer 2
            "Rome, Italy",
            "Stockholm, Sweden",
            "Berlin, Germany",
            "St. Louis, USA",
            "Amsterdam, Netherlands",
            "Sydney, Australia",
            "Tokyo, Japan"
        };
    }
}

class War implements Topics{
    @Override
    public String Question() {
        return "The D-Day landings of June 6, 1944, were a massive Allied operation intended to liberate which occupied European nation?";
    }
    public String[] Answer() {
        return new String[] {
            "Poland",
            "Norway",
            "France", // answer 2
            "Belgium",
            "The Netherlands",
            "Germany",
            "Italy",
            "Czechoslovakia",
            "Austria",
            "Denmark"
        };
    }
}

class TopicFactory {

    public static Topics getTopic(String name) {
        switch (name) {
            case "Football": return new Football();
            case "Music": return new Music();
            case "Science": return new Science();
            case "Movie": return new Movie();
            case "Nobel Prize": return new NobelPrize();
            case "History": return new History();
            case "Esport": return new Esport();
            case "Book": return new Book();
            case "Coding": return new Coding();
            case "Badminton": return new Badminton();
            case "Poetry": return new Poetry();
            case "Animal": return new Animal();
            case "Car": return new Car();
            case "Olympic": return new Olympic();
            case "War": return new War();
        }
        return null;
    }
}


class randomTopic {

    private ArrayList<String> list;

    public randomTopic() {
        list = new ArrayList<>(Arrays.asList(Topics.topics));
    }

    public String[] pickTwo() {
        Random random = new Random();
        String topic1 = list.remove(random.nextInt(list.size()));
        String topic2 = list.remove(random.nextInt(list.size()));
        return new String[]{topic1, topic2};
    }
}

class getCorrectAnswer {

    public static int getCorrectIndex(Topics t) {
        if (t instanceof Football) return 6;
        if (t instanceof Music) return 3;
        if (t instanceof Science) return 2;
        if (t instanceof Movie) return 4;
        if (t instanceof NobelPrize) return 4;
        if (t instanceof History) return 4;
        if (t instanceof Esport) return 4;
        if (t instanceof Book) return 4;
        if (t instanceof Coding) return 5;
        if (t instanceof Badminton) return 2;
        if (t instanceof Poetry) return 2;
        if (t instanceof Animal) return 3;
        if (t instanceof Car) return 0;
        if (t instanceof Olympic) return 2;
        if (t instanceof War) return 2;

        return -1; // should not happen
    }

    public static String[] getRandomAnswers(Topics t, int numberAnswers) {
    String[] all = t.Answer();
    int correctIndex = getCorrectIndex(t);

    ArrayList<String> options = new ArrayList<>();
    Random rand = new Random();

    // Add correct answer first
    options.add(all[correctIndex]);

    // Add random wrong answers until we reach desired size
    while (options.size() < numberAnswers) {
        int idx = rand.nextInt(all.length);
        if (idx != correctIndex) {
            String wrong = all[idx];
            if (!options.contains(wrong)) {
                options.add(wrong);
            }
        }
    }

    Collections.shuffle(options);
    return options.toArray(new String[0]);
}

    public static void printQuestionSet(Topics topic, int answerCount) {
    System.out.println("Question: " + topic.Question());

    String[] answers = getRandomAnswers(topic, answerCount);

    for (int i = 0; i < answers.length; i++) {
        System.out.println((i + 1) + ". " + answers[i]);
    }
}
}

class QuestionAnswer {

    public static void printQuestionSet(Topics topic, int answerCount) {
        System.out.println("Question: " + topic.Question());

        // Use GetCorrectAnswer to get randomized answers
        String[] answers = getCorrectAnswer.getRandomAnswers(topic, answerCount);

        for (int i = 0; i < answers.length; i++) {
            System.out.println((i + 1) + ". " + answers[i]);
        }
    }
}

// for gui
class QuestionSet {
    String topicName;
    String question;
    String[] answers;

    public QuestionSet(String topicName, String question, String[] answers) {
        this.topicName = topicName;
        this.question = question;
        this.answers = answers;
    }
}


// there will be 5 multiple answers
class level_1_Algorithm {
    public static void testLevel_1(randomTopic picker) {
        String[] topics = picker.pickTwo();

        // First topic
        String firstTopicName = topics[0];
        Topics firstTopic = TopicFactory.getTopic(firstTopicName);
        System.out.println("\nTopic: " + firstTopicName);
        getCorrectAnswer.printQuestionSet(firstTopic, 5);

        // Second topic
        String secondTopicName = topics[1];
        Topics secondTopic = TopicFactory.getTopic(secondTopicName);
        System.out.println("\nTopic: " + secondTopicName);
        getCorrectAnswer.printQuestionSet(secondTopic, 5);
    }
}

// there will be 4 multiple answers
class level_2 {
    public static void testLevel_2(randomTopic picker) {
        String[] topics = picker.pickTwo();

        // First topic
        String firstTopicName = topics[0];
        Topics firstTopic = TopicFactory.getTopic(firstTopicName);
        System.out.println("\nTopic: " + firstTopicName);
        getCorrectAnswer.printQuestionSet(firstTopic, 4);

        // Second topic
        String secondTopicName = topics[1];
        Topics secondTopic = TopicFactory.getTopic(secondTopicName);
        System.out.println("\nTopic: " + secondTopicName);
        getCorrectAnswer.printQuestionSet(secondTopic, 4);
    }
}

// there will be 3 multiple answers
class level_3 {
    public static void testLevel_3(randomTopic picker) {
        String[] topics = picker.pickTwo();

        // First topic
        String firstTopicName = topics[0];
        Topics firstTopic = TopicFactory.getTopic(firstTopicName);
        System.out.println("\nTopic: " + firstTopicName);
        getCorrectAnswer.printQuestionSet(firstTopic, 3);

        // Second topic
        String secondTopicName = topics[1];
        Topics secondTopic = TopicFactory.getTopic(secondTopicName);
        System.out.println("\nTopic: " + secondTopicName);
        getCorrectAnswer.printQuestionSet(secondTopic, 3);
    }
}

// there will be 3 multiple answers
// only can be selected
class level_4 {
    public static void testLevel_4(randomTopic picker) {
        String[] topics = picker.pickTwo();

        // First topic
        String firstTopicName = topics[0];
        Topics firstTopic = TopicFactory.getTopic(firstTopicName);
        System.out.println("\nTopic: " + firstTopicName);
        getCorrectAnswer.printQuestionSet(firstTopic, 3);

        // Second topic
        String secondTopicName = topics[1];
        Topics secondTopic = TopicFactory.getTopic(secondTopicName);
        System.out.println("\nTopic: " + secondTopicName);
        getCorrectAnswer.printQuestionSet(secondTopic, 3);
    }
}

// there will be only 2 multiple ansewers
class level_5 {
    public static void testLevel_5(randomTopic picker) {
        String[] topics = picker.pickTwo();

        // First topic
        String firstTopicName = topics[0];
        Topics firstTopic = TopicFactory.getTopic(firstTopicName);
        System.out.println("\nTopic: " + firstTopicName);
        getCorrectAnswer.printQuestionSet(firstTopic, 2);

        // Second topic
        String secondTopicName = topics[1];
        Topics secondTopic = TopicFactory.getTopic(secondTopicName);
        System.out.println("\nTopic: " + secondTopicName);
        getCorrectAnswer.printQuestionSet(secondTopic, 2);
    }
}

// gui first screen aka game window
class GameWindow extends JFrame {

    public CardLayout cardLayout;
    public JPanel mainPanel;  
    public JPanel firstScreen; 

    public GameWindow() {

        setSize(750, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        firstScreen = new JPanel();
        firstScreen.setForeground(new Color(0, 0, 0));
        firstScreen.setBackground(new Color(238, 238, 238));
        firstScreen.setLayout(null);

        JLabel title = new JLabel("The Money Drop Sejong");
        title.setBounds(37, 66, 689, 70);
        title.setFont(new Font("Arial", Font.BOLD, 60));
        firstScreen.add(title);

        JButton startButton = new JButton("Game Start");
        startButton.setBounds(147, 246, 426, 139);
        startButton.setFont(new Font("Arima Koshi", Font.BOLD, 60));

        startButton.addActionListener(e -> showScreen("Topic_1"));

        firstScreen.add(startButton);

        // ======= ADD SCREENS TO mainPanel =======
        mainPanel.add(firstScreen, "Start");

        mainPanel.add(new Topic_1(this), "Topic_1");
        //mainPanel.add(new Level_1(this), "Level_1");
        //mainPanel.add(new Result_1(this), "Result_1");
        //mainPanel.add(new Topic_2(this), "Topic_2");
        //mainPanel.add(new Level_2(this), "Level_2");
        //mainPanel.add(new Result_2(this), "Result_2");
        //mainPanel.add(new Topic_3(this), "Topic_3");
        //mainPanel.add(new Level_3(this), "Level_3");
        //mainPanel.add(new Result_3(this), "Result_3");
        //mainPanel.add(new Topic_4(this), "Topic_4");
        //mainPanel.add(new Level_4(this), "Level_4");
        //mainPanel.add(new Result_4(this), "Result_4");
        //mainPanel.add(new Topic_5(this), "Topic_5");
        //mainPanel.add(new Level_5(this), "Level_5");
        //mainPanel.add(new Result_5(this), "Result_5");
        //mainPanel.add(new FinalResultWin(this), "Win");
        //mainPanel.add(new FinalResultLose(this), "Lose");

        getContentPane().add(mainPanel);

        showScreen("Start");

        setVisible(true);
    }

    public void showScreen(String name) {
        cardLayout.show(mainPanel, name);
    }

    public void showLevel(String levelName) {
        showScreen(levelName);
    }

    public static void main(String[] args) {
        new GameWindow();
    }
}

class Topic_1 extends JPanel {

    public Topic_1(GameWindow window) {

        setSize(750,600);
        setLayout(null);

        randomTopic picker = new randomTopic();
        String[] topics = picker.pickTwo();

        JButton firstTopic = new JButton(topics[0]);
        firstTopic.setBounds(199, 115, 343, 156);
        firstTopic.setFont(new Font("Arial", Font.BOLD, 30));
        firstTopic.addActionListener(e -> window.showScreen("Level_1"));
        add(firstTopic);

        JButton secondTopic = new JButton(topics[1]);
        secondTopic.setBounds(199, 336, 343, 156);
        secondTopic.setFont(new Font("Arial", Font.BOLD, 30));
        secondTopic.addActionListener(e -> window.showScreen("Level_1"));
        add(secondTopic);
    }
}

public class money_drop_sejong {
    public static void main(String[] args) {
        randomTopic picker = new randomTopic();
        level_1_Algorithm.testLevel_1(picker);
        System.out.printf("\n\n");
        level_2.testLevel_2(picker);
        System.out.printf("\n\n");
        level_3.testLevel_3(picker);
        System.out.printf("\n\n");
        level_4.testLevel_4(picker);
        System.out.printf("\n\n");
        level_5.testLevel_5(picker);
    }
}