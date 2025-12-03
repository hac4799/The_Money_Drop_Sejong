import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

interface Topics {
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

class Music implements Topics {
    @Override
    public String Question() {
        return "Who sing a song \"Said I loved you … but I lied\"?";
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

class Science implements Topics {
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

class Movie implements Topics {
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

class NobelPrize implements Topics {
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

class History implements Topics {
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

class Esport implements Topics {
    @Override
    public String Question() {
        return "Which organization won the Dota 2 tournament known as \"The International\" in 2023, cementing their status as a new dynasty in the game?";
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

class Book implements Topics {
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

class Coding implements Topics {
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

class Badminton implements Topics {
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

class Poetry implements Topics {
    @Override
    public String Question() {
        return "Complete the line of the popular modern poem: \"You say you love the rain, but you open your umbrella. You say you love me too...\"";
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

class Animal implements Topics {
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

class Car implements Topics {
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

class Olympic implements Topics {
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

class War implements Topics {
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
            // skip the correct
            if (idx != correctIndex) {
                String wrong = all[idx];
                // duplicates
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

//GAME WINDOW
class GameWindow extends JFrame {
    // initial amount for the user
    public static AtomicInteger current_amount = new AtomicInteger(1000000); // share all level

    public CardLayout cardLayout;
    public JPanel mainPanel;
    public JPanel firstScreen;

    // Store level results (for the *current* level)
    private boolean[] levelCorrectSelections; // answer wrong/ right
    private int[] levelBetAmounts;
    private int levelFinalAmount;

    // Store topics per level and which level's result we are showing
    private Topics[] levelTopics = new Topics[5];
    private int currentLevelIndex = -1; // which level we are on

    // when player submit answers in a level
    public void setLevelResults(boolean[] correctSelections, int[] betAmounts) {
        this.levelCorrectSelections = correctSelections; // which ansewrs correct
        this.levelBetAmounts = betAmounts; // bet amount for each answer
        calculateLevelFinalAmount(); // how much player still have 
    }

    public GameWindow() {

        setSize(740, 640);
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

        // ADD SCREENS TO mainPanel
        mainPanel.add(firstScreen, "Start");

        // Topics for each level
        Topic_1 topic1Panel = new Topic_1(this);
        mainPanel.add(topic1Panel, "Topic_1");

        Topic_2 topic2Panel = new Topic_2(this);
        mainPanel.add(topic2Panel, "Topic_2");

        Topic_3 topic3Panel = new Topic_3(this);
        mainPanel.add(topic3Panel, "Topic_3");

        Topic_4 topic4Panel = new Topic_4(this);
        mainPanel.add(topic4Panel, "Topic_4");

        Topic_5 topic5Panel = new Topic_5(this);
        mainPanel.add(topic5Panel, "Topic_5");

        // Lose screen
        FinalResultLose losePanel = new FinalResultLose(this);
        mainPanel.add(losePanel, "Lose");

        getContentPane().add(mainPanel);

        showScreen("Start");

        setVisible(true);
    }

    public void showScreen(String name) {
        cardLayout.show(mainPanel, name);
    }

    // Show a Level panel depending on levelName
    public void showLevel(String levelName, Topics topic) {

        int idx = -1; // which level is this
        if ("Level_1".equals(levelName)) idx = 0;
        else if ("Level_2".equals(levelName)) idx = 1;
        else if ("Level_3".equals(levelName)) idx = 2;
        else if ("Level_4".equals(levelName)) idx = 3;
        else if ("Level_5".equals(levelName)) idx = 4;

        if (idx != -1) {
            currentLevelIndex = idx; // track current level
            levelTopics[idx] = topic; // which topic was used
        }

        JPanel levelPanel = null;
        if ("Level_1".equals(levelName)) {
            levelPanel = new Level_1(this, topic);
        } else if ("Level_2".equals(levelName)) {
            levelPanel = new Level_2(this, topic);
        } else if ("Level_3".equals(levelName)) {
            levelPanel = new Level_3(this, topic);
        } else if ("Level_4".equals(levelName)) {
            levelPanel = new Level_4(this, topic);
        } else if ("Level_5".equals(levelName)) {
            levelPanel = new Level_5(this, topic);
        }

        if (levelPanel != null) {
            mainPanel.add(levelPanel, levelName);
            showScreen(levelName);
        }
    }

    private void calculateLevelFinalAmount() {
        int totalWinnings = 0;

        // for each answer
        if (levelCorrectSelections != null && levelBetAmounts != null) {
            for (int i = 0; i < levelCorrectSelections.length; i++) {
                // if bet on it and it is correct, keep that
                if (levelCorrectSelections[i] && levelBetAmounts[i] > 0) {
                    totalWinnings += levelBetAmounts[i];
                }
            }
        }

        this.levelFinalAmount = totalWinnings;
        // Update the current amount for the next level
        current_amount.set(totalWinnings);
    }

    // Getter methods for Result screens
    public boolean[] getLevelCorrectSelections() { return levelCorrectSelections; }
    public int[] getLevelBetAmounts() { return levelBetAmounts; }
    public int getLevelFinalAmount() { return levelFinalAmount; }

    // Get correct answer text for *current* level
    public String getLevelCorrectAnswerText() {
        if (currentLevelIndex < 0 || currentLevelIndex >= levelTopics.length) return "";
        Topics t = levelTopics[currentLevelIndex]; // get topic for this level
        if (t == null) return "";
        int idx = getCorrectAnswer.getCorrectIndex(t);
        return t.Answer()[idx];
    }

    // Show Results
    public void showResult1() {
        Result_1 result1 = new Result_1(this);
        mainPanel.add(result1, "Result_1");
        showScreen("Result_1");
    }

    public void showResult2() {
        Result_2 result2 = new Result_2(this);
        mainPanel.add(result2, "Result_2");
        showScreen("Result_2");
    }

    public void showResult3() {
        Result_3 result3 = new Result_3(this);
        mainPanel.add(result3, "Result_3");
        showScreen("Result_3");
    }

    public void showResult4() {
        Result_4 result4 = new Result_4(this);
        mainPanel.add(result4, "Result_4");
        showScreen("Result_4");
    }

    public void showResult5() {
        Result_5 result5 = new Result_5(this);
        mainPanel.add(result5, "Result_5");
        showScreen("Result_5");
    }

    public static void main(String[] args) {
        new GameWindow();
    }
}

//TOPIC PANELS
class Topic_1 extends JPanel {
    private String[] topics;
    private Topics selectedTopic;

    public Topic_1(GameWindow window) {

        setSize(750,600);
        setLayout(null);

        randomTopic picker = new randomTopic();
        this.topics = picker.pickTwo();

        JButton firstTopic = new JButton(topics[0]);
        firstTopic.setBounds(199, 115, 343, 156);
        firstTopic.setFont(new Font("Arial", Font.BOLD, 30));
        firstTopic.addActionListener(e -> {
            selectedTopic = TopicFactory.getTopic(topics[0]);
            window.showLevel("Level_1", selectedTopic);
        });
        add(firstTopic);

        JButton secondTopic = new JButton(topics[1]);
        secondTopic.setBounds(199, 336, 343, 156);
        secondTopic.setFont(new Font("Arial", Font.BOLD, 30));
        secondTopic.addActionListener(e -> {
            selectedTopic = TopicFactory.getTopic(topics[1]);
            window.showLevel("Level_1", selectedTopic);
        });
        add(secondTopic);
    }
}

class Topic_2 extends JPanel {
    private String[] topics;
    private Topics selectedTopic;

    public Topic_2(GameWindow window) {

        setSize(750,600);
        setLayout(null);

        randomTopic picker = new randomTopic();
        this.topics = picker.pickTwo();

        JButton firstTopic = new JButton(topics[0]);
        firstTopic.setBounds(199, 115, 343, 156);
        firstTopic.setFont(new Font("Arial", Font.BOLD, 30));
        firstTopic.addActionListener(e -> {
            selectedTopic = TopicFactory.getTopic(topics[0]);
            window.showLevel("Level_2", selectedTopic);
        });
        add(firstTopic);

        JButton secondTopic = new JButton(topics[1]);
        secondTopic.setBounds(199, 336, 343, 156);
        secondTopic.setFont(new Font("Arial", Font.BOLD, 30));
        secondTopic.addActionListener(e -> {
            selectedTopic = TopicFactory.getTopic(topics[1]);
            window.showLevel("Level_2", selectedTopic);
        });
        add(secondTopic);
    }
}

class Topic_3 extends JPanel {
    private String[] topics;
    private Topics selectedTopic;

    public Topic_3(GameWindow window) {

        setSize(750,600);
        setLayout(null);

        randomTopic picker = new randomTopic();
        this.topics = picker.pickTwo();

        JButton firstTopic = new JButton(topics[0]);
        firstTopic.setBounds(199, 115, 343, 156);
        firstTopic.setFont(new Font("Arial", Font.BOLD, 30));
        firstTopic.addActionListener(e -> {
            selectedTopic = TopicFactory.getTopic(topics[0]);
            window.showLevel("Level_3", selectedTopic);
        });
        add(firstTopic);

        JButton secondTopic = new JButton(topics[1]);
        secondTopic.setBounds(199, 336, 343, 156);
        secondTopic.setFont(new Font("Arial", Font.BOLD, 30));
        secondTopic.addActionListener(e -> {
            selectedTopic = TopicFactory.getTopic(topics[1]);
            window.showLevel("Level_3", selectedTopic);
        });
        add(secondTopic);
    }
}

class Topic_4 extends JPanel {
    private String[] topics;
    private Topics selectedTopic;

    public Topic_4(GameWindow window) {

        setSize(750,600);
        setLayout(null);

        randomTopic picker = new randomTopic();
        this.topics = picker.pickTwo();

        JButton firstTopic = new JButton(topics[0]);
        firstTopic.setBounds(199, 115, 343, 156);
        firstTopic.setFont(new Font("Arial", Font.BOLD, 30));
        firstTopic.addActionListener(e -> {
            selectedTopic = TopicFactory.getTopic(topics[0]);
            window.showLevel("Level_4", selectedTopic);
        });
        add(firstTopic);

        JButton secondTopic = new JButton(topics[1]);
        secondTopic.setBounds(199, 336, 343, 156);
        secondTopic.setFont(new Font("Arial", Font.BOLD, 30));
        secondTopic.addActionListener(e -> {
            selectedTopic = TopicFactory.getTopic(topics[1]);
            window.showLevel("Level_4", selectedTopic);
        });
        add(secondTopic);
    }
}

class Topic_5 extends JPanel {
    private String[] topics;
    private Topics selectedTopic;

    public Topic_5(GameWindow window) {

        setSize(750,600);
        setLayout(null);

        randomTopic picker = new randomTopic();
        this.topics = picker.pickTwo();

        JButton firstTopic = new JButton(topics[0]);
        firstTopic.setBounds(199, 115, 343, 156);
        firstTopic.setFont(new Font("Arial", Font.BOLD, 30));
        firstTopic.addActionListener(e -> {
            selectedTopic = TopicFactory.getTopic(topics[0]);
            window.showLevel("Level_5", selectedTopic);
        });
        add(firstTopic);

        JButton secondTopic = new JButton(topics[1]);
        secondTopic.setBounds(199, 336, 343, 156);
        secondTopic.setFont(new Font("Arial", Font.BOLD, 30));
        secondTopic.addActionListener(e -> {
            selectedTopic = TopicFactory.getTopic(topics[1]);
            window.showLevel("Level_5", selectedTopic);
        });
        add(secondTopic);
    }
}

// can select max 4 answers out of 5
class Level_1 extends JPanel {
    private Topics topic;
    private AtomicInteger[] betAmounts; // bet on each answers 5
    private JCheckBox[] checkBox;
    private String[] answers;
    private int correctAnswerIndex; // index of correct answer

    public Level_1(GameWindow window, Topics topic) {

        this.topic = topic; // store topic object passed from Topic_1
        this.betAmounts = new AtomicInteger[5];
        this.correctAnswerIndex = getCorrectAnswer.getCorrectIndex(topic); // correct answer

        for (int i = 0; i < 5; i++) {
            betAmounts[i] = new AtomicInteger(0);
        }

        this.answers = getCorrectAnswer.getRandomAnswers(topic, 5); // get 5 random including correct one

        JButton next = new JButton("Submit");
        next.setFont(new Font("Arial", Font.BOLD, 30));
        next.setBounds(388, 521, 198, 72);
        setLayout(null);
        add(next);

        this.checkBox = new JCheckBox[5];

        checkBox[0] = new JCheckBox("<html>" + answers[0] + "</html>");
        checkBox[0].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[0].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[0].setBounds(21, 110, 295, 75);
        add(checkBox[0]);

        checkBox[1] = new JCheckBox("<html>" + answers[1] + "</html>");
        checkBox[1].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[1].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[1].setBounds(21, 190, 295, 75);
        add(checkBox[1]);

        checkBox[2] = new JCheckBox("<html>" + answers[2] + "</html>");
        checkBox[2].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[2].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[2].setBounds(21, 270, 295, 75);
        add(checkBox[2]);

        checkBox[3] = new JCheckBox("<html>" + answers[3] + "</html>");
        checkBox[3].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[3].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[3].setBounds(21, 350, 295, 75);
        add(checkBox[3]);

        checkBox[4] = new JCheckBox("<html>" + answers[4] + "</html>");
        checkBox[4].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[4].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[4].setBounds(21, 430, 295, 75);
        add(checkBox[4]);

        JLabel currentAmount = new JLabel("Current Amount - ");
        currentAmount.setFont(new Font("Annai MN", Font.PLAIN, 20));
        currentAmount.setHorizontalAlignment(SwingConstants.CENTER);
        currentAmount.setBounds(31, 524, 178, 68);
        add(currentAmount);

        JLabel currentAmountMoney = new JLabel(String.valueOf(GameWindow.current_amount.get()));
        currentAmountMoney.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        currentAmountMoney.setBounds(221, 542, 97, 33);
        add(currentAmountMoney);

        JLabel quesTion = new JLabel("<html>" + topic.Question() + "</html>");
        quesTion.setHorizontalAlignment(SwingConstants.CENTER);
        quesTion.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        quesTion.setVerticalAlignment(SwingConstants.TOP);
        quesTion.setBounds(38, 32, 550, 79);
        add(quesTion);

        JButton addition_1 = new JButton("+");
        addition_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_1.setBounds(328, 120, 60, 60);
        add(addition_1);

        JButton subtraction_1 = new JButton("-");
        subtraction_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_1.setBounds(526, 120, 60, 60);
        add(subtraction_1);

        JButton addition_2 = new JButton("+");
        addition_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_2.setBounds(328, 200, 60, 60);
        add(addition_2);

        JButton addition_3 = new JButton("+");
        addition_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_3.setBounds(328, 280, 60, 60);
        add(addition_3);

        JButton addition_4 = new JButton("+");
        addition_4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_4.setBounds(328, 360, 60, 60);
        add(addition_4);

        JButton addition_5 = new JButton("+");
        addition_5.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_5.setBounds(328, 440, 60, 60);
        add(addition_5);

        JButton subtraction_2 = new JButton("-");
        subtraction_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_2.setBounds(526, 200, 60, 60);
        add(subtraction_2);

        JButton subtraction_3 = new JButton("-");
        subtraction_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_3.setBounds(526, 280, 60, 60);
        add(subtraction_3);

        JButton subtraction_4 = new JButton("-");
        subtraction_4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_4.setBounds(526, 360, 60, 60);
        add(subtraction_4);

        JButton subtraction_5 = new JButton("-");
        subtraction_5.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_5.setBounds(526, 440, 60, 60);
        add(subtraction_5);

        JLabel initialValue_1 = new JLabel(String.valueOf(betAmounts[0].get()));
        initialValue_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_1.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_1.setBounds(400, 120, 114, 60);
        add(initialValue_1);

        JLabel initialValue_2 = new JLabel(String.valueOf(betAmounts[1].get()));
        initialValue_2.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_2.setBounds(400, 200, 114, 60);
        add(initialValue_2);

        JLabel initialValue_3 = new JLabel(String.valueOf(betAmounts[2].get()));
        initialValue_3.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_3.setBounds(400, 280, 114, 60);
        add(initialValue_3);

        JLabel initialValue_4 = new JLabel(String.valueOf(betAmounts[3].get()));
        initialValue_4.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_4.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_4.setBounds(400, 360, 114, 60);
        add(initialValue_4);

        JLabel initialValue_5 = new JLabel(String.valueOf(betAmounts[4].get()));
        initialValue_5.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_5.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_5.setBounds(400, 440, 114, 60);
        add(initialValue_5);

        // max 4 selections out of 5
        for (JCheckBox cb : checkBox) {
            cb.addActionListener(e -> {
                int selectedCount = countSelectedCheckboxes(checkBox);
                if (selectedCount > 4 && ((JCheckBox)e.getSource()).isSelected()) {
                    ((JCheckBox)e.getSource()).setSelected(false);
                }
            });
        }

        next.addActionListener(e -> {
            // how many answers are selected
            int selectedCount = countSelectedCheckboxes(checkBox);

            if (selectedCount >= 1 && selectedCount <= 4) {
                boolean[] correctSelections = calculateCorrectSelections(); // which answers were correct
                int[] betAmountsArray = getBetAmountsArray(); // bet get amounts

                // Store the data in GameWindow to pass to Result_1
                window.setLevelResults(correctSelections, betAmountsArray);
                // Show Result_1 screen after setting results
                window.showResult1();
            }
        });

        // checkBox 1
        addition_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // check for every answer
                if (checkBox[0].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[0].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_1.setText(String.valueOf(betAmounts[0].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        subtraction_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[0].isSelected() && betAmounts[0].get() >= 100000) {
                    betAmounts[0].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_1.setText(String.valueOf(betAmounts[0].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        // checkBox 2
        addition_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[1].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[1].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_2.setText(String.valueOf(betAmounts[1].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
        subtraction_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[1].isSelected() && betAmounts[1].get() >= 100000) {
                    betAmounts[1].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_2.setText(String.valueOf(betAmounts[1].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        // checkBox 3
        addition_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[2].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[2].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_3.setText(String.valueOf(betAmounts[2].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
        subtraction_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[2].isSelected() && betAmounts[2].get() >= 100000) {
                    betAmounts[2].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_3.setText(String.valueOf(betAmounts[2].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        // checkBox 4
        addition_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[3].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[3].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_4.setText(String.valueOf(betAmounts[3].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
        subtraction_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[3].isSelected() && betAmounts[3].get() >= 100000) {
                    betAmounts[3].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_4.setText(String.valueOf(betAmounts[3].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        // checkBox 5
        addition_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[4].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[4].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_5.setText(String.valueOf(betAmounts[4].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
        subtraction_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[4].isSelected() && betAmounts[4].get() >= 100000) {
                    betAmounts[4].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_5.setText(String.valueOf(betAmounts[4].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
    }

    private int countSelectedCheckboxes(JCheckBox[] checkboxes) {
        int count = 0;
        for (JCheckBox cb : checkboxes) {
            if (cb.isSelected()) {
                count++;
            }
        }
        return count;
    }

    private boolean[] calculateCorrectSelections() {
        boolean[] correct = new boolean[5]; // 5 answers
        String correctAnswerText = topic.Answer()[correctAnswerIndex]; // answer name to display in level

        for (int i = 0; i < answers.length; i++) {
            correct[i] = answers[i].equals(correctAnswerText); // the correct answer
        }
        return correct;
    }

    private int[] getBetAmountsArray() {
        int[] amounts = new int[5]; // convert AtomicInteger to regular int
        for (int i = 0; i < 5; i++) {
            amounts[i] = betAmounts[i].get();
        }
        return amounts;
    }
}

// 4 answers, max 3 selections
class Level_2 extends JPanel {
    private Topics topic;
    private AtomicInteger[] betAmounts;
    private JCheckBox[] checkBox;
    private String[] answers;
    private int correctAnswerIndex;

    public Level_2(GameWindow window, Topics topic) {

        this.topic = topic;
        this.betAmounts = new AtomicInteger[4];
        this.correctAnswerIndex = getCorrectAnswer.getCorrectIndex(topic);

        // Initialize betAmounts array
        for (int i = 0; i < 4; i++) {
            betAmounts[i] = new AtomicInteger(0);
        }

        // Initialize the answers array properly
        this.answers = getCorrectAnswer.getRandomAnswers(topic, 4);

        JButton next = new JButton("Submit");
        next.setFont(new Font("Arial", Font.BOLD, 30));
        next.setBounds(388, 521, 198, 72);
        setLayout(null);
        add(next);

        this.checkBox = new JCheckBox[4];

        checkBox[0] = new JCheckBox("<html>" + answers[0] + "</html>");
        checkBox[0].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[0].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[0].setBounds(21, 110, 295, 75);
        add(checkBox[0]);

        checkBox[1] = new JCheckBox("<html>" + answers[1] + "</html>");
        checkBox[1].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[1].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[1].setBounds(21, 190, 295, 75);
        add(checkBox[1]);

        checkBox[2] = new JCheckBox("<html>" + answers[2] + "</html>");
        checkBox[2].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[2].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[2].setBounds(21, 270, 295, 75);
        add(checkBox[2]);

        checkBox[3] = new JCheckBox("<html>" + answers[3] + "</html>");
        checkBox[3].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[3].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[3].setBounds(21, 350, 295, 75);
        add(checkBox[3]);

        JLabel currentAmount = new JLabel("Current Amount - ");
        currentAmount.setFont(new Font("Annai MN", Font.PLAIN, 20));
        currentAmount.setHorizontalAlignment(SwingConstants.CENTER);
        currentAmount.setBounds(31, 524, 178, 68);
        add(currentAmount);

        JLabel currentAmountMoney = new JLabel(String.valueOf(GameWindow.current_amount.get()));
        currentAmountMoney.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        currentAmountMoney.setBounds(221, 542, 97, 33);
        add(currentAmountMoney);

        JLabel quesTion = new JLabel("<html>" + topic.Question() + "</html>");
        quesTion.setHorizontalAlignment(SwingConstants.CENTER);
        quesTion.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        quesTion.setVerticalAlignment(SwingConstants.TOP);
        quesTion.setBounds(38, 32, 550, 79);
        add(quesTion);

        JButton addition_1 = new JButton("+");
        addition_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_1.setBounds(328, 120, 60, 60);
        add(addition_1);

        JButton subtraction_1 = new JButton("-");
        subtraction_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_1.setBounds(526, 120, 60, 60);
        add(subtraction_1);

        JButton addition_2 = new JButton("+");
        addition_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_2.setBounds(328, 200, 60, 60);
        add(addition_2);

        JButton addition_3 = new JButton("+");
        addition_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_3.setBounds(328, 280, 60, 60);
        add(addition_3);

        JButton addition_4 = new JButton("+");
        addition_4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_4.setBounds(328, 360, 60, 60);
        add(addition_4);

        JButton subtraction_2 = new JButton("-");
        subtraction_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_2.setBounds(526, 200, 60, 60);
        add(subtraction_2);

        JButton subtraction_3 = new JButton("-");
        subtraction_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_3.setBounds(526, 280, 60, 60);
        add(subtraction_3);

        JButton subtraction_4 = new JButton("-");
        subtraction_4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_4.setBounds(526, 360, 60, 60);
        add(subtraction_4);

        JLabel initialValue_1 = new JLabel(String.valueOf(betAmounts[0].get()));
        initialValue_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_1.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_1.setBounds(400, 120, 114, 60);
        add(initialValue_1);

        JLabel initialValue_2 = new JLabel(String.valueOf(betAmounts[1].get()));
        initialValue_2.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_2.setBounds(400, 200, 114, 60);
        add(initialValue_2);

        JLabel initialValue_3 = new JLabel(String.valueOf(betAmounts[2].get()));
        initialValue_3.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_3.setBounds(400, 280, 114, 60);
        add(initialValue_3);

        JLabel initialValue_4 = new JLabel(String.valueOf(betAmounts[3].get()));
        initialValue_4.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_4.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_4.setBounds(400, 360, 114, 60);
        add(initialValue_4);

        // max 3 selections out of 4
        for (JCheckBox cb : checkBox) {
            cb.addActionListener(e -> {
                int selectedCount = countSelectedCheckboxes(checkBox);
                if (selectedCount > 3 && ((JCheckBox)e.getSource()).isSelected()) {
                    ((JCheckBox)e.getSource()).setSelected(false);
                }
            });
        }

        next.addActionListener(e -> {
            int selectedCount = countSelectedCheckboxes(checkBox);

            if (selectedCount >= 1 && selectedCount <= 3) {
                boolean[] correctSelections = calculateCorrectSelections();
                int[] betAmountsArray = getBetAmountsArray();

                // Store the data in GameWindow to pass to Result_2
                window.setLevelResults(correctSelections, betAmountsArray);
                // Show Result_2 screen after setting results
                window.showResult2();
            }
        });

        // checkBox 1
        addition_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[0].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[0].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_1.setText(String.valueOf(betAmounts[0].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        subtraction_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[0].isSelected() && betAmounts[0].get() >= 100000) {
                    betAmounts[0].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_1.setText(String.valueOf(betAmounts[0].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        // checkBox 2
        addition_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[1].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[1].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_2.setText(String.valueOf(betAmounts[1].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
        subtraction_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[1].isSelected() && betAmounts[1].get() >= 100000) {
                    betAmounts[1].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_2.setText(String.valueOf(betAmounts[1].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        // checkBox 3
        addition_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[2].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[2].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_3.setText(String.valueOf(betAmounts[2].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
        subtraction_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[2].isSelected() && betAmounts[2].get() >= 100000) {
                    betAmounts[2].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_3.setText(String.valueOf(betAmounts[2].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        // checkBox 4
        addition_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[3].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[3].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_4.setText(String.valueOf(betAmounts[3].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
        subtraction_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[3].isSelected() && betAmounts[3].get() >= 100000) {
                    betAmounts[3].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_4.setText(String.valueOf(betAmounts[3].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
    }

    private int countSelectedCheckboxes(JCheckBox[] checkboxes) {
        int count = 0;
        for (JCheckBox cb : checkboxes) {
            if (cb.isSelected()) {
                count++;
            }
        }
        return count;
    }

    private boolean[] calculateCorrectSelections() {
        boolean[] correct = new boolean[4];
        // Find which shuffled answers correspond to the correct answer
        String correctAnswerText = topic.Answer()[correctAnswerIndex];

        for (int i = 0; i < answers.length; i++) {
            correct[i] = answers[i].equals(correctAnswerText);
        }
        return correct;
    }

    private int[] getBetAmountsArray() {
        int[] amounts = new int[4];
        for (int i = 0; i < 4; i++) {
            amounts[i] = betAmounts[i].get();
        }
        return amounts;
    }
}

// 3 answers, max 2 selections
class Level_3 extends JPanel {
    private Topics topic;
    private AtomicInteger[] betAmounts;
    private JCheckBox[] checkBox;
    private String[] answers;
    private int correctAnswerIndex;

    public Level_3(GameWindow window, Topics topic) {

        this.topic = topic;
        this.betAmounts = new AtomicInteger[3];
        this.correctAnswerIndex = getCorrectAnswer.getCorrectIndex(topic);

        // Initialize betAmounts array
        for (int i = 0; i < 3; i++) {
            betAmounts[i] = new AtomicInteger(0);
        }

        // Initialize the answers array properly
        this.answers = getCorrectAnswer.getRandomAnswers(topic, 3);

        JButton next = new JButton("Submit");
        next.setFont(new Font("Arial", Font.BOLD, 30));
        next.setBounds(388, 521, 198, 72);
        setLayout(null);
        add(next);

        this.checkBox = new JCheckBox[3];

        checkBox[0] = new JCheckBox("<html>" + answers[0] + "</html>");
        checkBox[0].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[0].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[0].setBounds(21, 110, 295, 75);
        add(checkBox[0]);

        checkBox[1] = new JCheckBox("<html>" + answers[1] + "</html>");
        checkBox[1].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[1].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[1].setBounds(21, 190, 295, 75);
        add(checkBox[1]);

        checkBox[2] = new JCheckBox("<html>" + answers[2] + "</html>");
        checkBox[2].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[2].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[2].setBounds(21, 270, 295, 75);
        add(checkBox[2]);

        JLabel currentAmount = new JLabel("Current Amount - ");
        currentAmount.setFont(new Font("Annai MN", Font.PLAIN, 20));
        currentAmount.setHorizontalAlignment(SwingConstants.CENTER);
        currentAmount.setBounds(31, 524, 178, 68);
        add(currentAmount);

        JLabel currentAmountMoney = new JLabel(String.valueOf(GameWindow.current_amount.get()));
        currentAmountMoney.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        currentAmountMoney.setBounds(221, 542, 97, 33);
        add(currentAmountMoney);

        JLabel quesTion = new JLabel("<html>" + topic.Question() + "</html>");
        quesTion.setHorizontalAlignment(SwingConstants.CENTER);
        quesTion.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        quesTion.setVerticalAlignment(SwingConstants.TOP);
        quesTion.setBounds(38, 32, 550, 79);
        add(quesTion);

        JButton addition_1 = new JButton("+");
        addition_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_1.setBounds(328, 120, 60, 60);
        add(addition_1);

        JButton subtraction_1 = new JButton("-");
        subtraction_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_1.setBounds(526, 120, 60, 60);
        add(subtraction_1);

        JButton addition_2 = new JButton("+");
        addition_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_2.setBounds(328, 200, 60, 60);
        add(addition_2);

        JButton addition_3 = new JButton("+");
        addition_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_3.setBounds(328, 280, 60, 60);
        add(addition_3);

        JButton subtraction_2 = new JButton("-");
        subtraction_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_2.setBounds(526, 200, 60, 60);
        add(subtraction_2);

        JButton subtraction_3 = new JButton("-");
        subtraction_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_3.setBounds(526, 280, 60, 60);
        add(subtraction_3);

        JLabel initialValue_1 = new JLabel(String.valueOf(betAmounts[0].get()));
        initialValue_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_1.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_1.setBounds(400, 120, 114, 60);
        add(initialValue_1);

        JLabel initialValue_2 = new JLabel(String.valueOf(betAmounts[1].get()));
        initialValue_2.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_2.setBounds(400, 200, 114, 60);
        add(initialValue_2);

        JLabel initialValue_3 = new JLabel(String.valueOf(betAmounts[2].get()));
        initialValue_3.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_3.setBounds(400, 280, 114, 60);
        add(initialValue_3);

        // max 2 selections out of 3
        for (JCheckBox cb : checkBox) {
            cb.addActionListener(e -> {
                int selectedCount = countSelectedCheckboxes(checkBox);
                if (selectedCount > 2 && ((JCheckBox)e.getSource()).isSelected()) {
                    ((JCheckBox)e.getSource()).setSelected(false);
                }
            });
        }

        next.addActionListener(e -> {
            int selectedCount = countSelectedCheckboxes(checkBox);

            if (selectedCount >= 1 && selectedCount <= 2) {
                boolean[] correctSelections = calculateCorrectSelections();
                int[] betAmountsArray = getBetAmountsArray();

                // Store the data in GameWindow to pass to Result_3
                window.setLevelResults(correctSelections, betAmountsArray);
                // Show Result_3 screen after setting results
                window.showResult3();
            }
        });

        // checkBox 1
        addition_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[0].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[0].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_1.setText(String.valueOf(betAmounts[0].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        subtraction_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[0].isSelected() && betAmounts[0].get() >= 100000) {
                    betAmounts[0].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_1.setText(String.valueOf(betAmounts[0].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        // checkBox 2
        addition_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[1].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[1].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_2.setText(String.valueOf(betAmounts[1].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
        subtraction_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[1].isSelected() && betAmounts[1].get() >= 100000) {
                    betAmounts[1].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_2.setText(String.valueOf(betAmounts[1].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        // checkBox 3
        addition_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[2].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[2].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_3.setText(String.valueOf(betAmounts[2].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
        subtraction_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[2].isSelected() && betAmounts[2].get() >= 100000) {
                    betAmounts[2].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_3.setText(String.valueOf(betAmounts[2].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
    }

    private int countSelectedCheckboxes(JCheckBox[] checkboxes) {
        int count = 0;
        for (JCheckBox cb : checkboxes) {
            if (cb.isSelected()) {
                count++;
            }
        }
        return count;
    }

    private boolean[] calculateCorrectSelections() {
        boolean[] correct = new boolean[3];
        // Find which shuffled answers correspond to the correct answer
        String correctAnswerText = topic.Answer()[correctAnswerIndex];

        for (int i = 0; i < answers.length; i++) {
            correct[i] = answers[i].equals(correctAnswerText);
        }
        return correct;
    }

    private int[] getBetAmountsArray() {
        int[] amounts = new int[3];
        for (int i = 0; i < 3; i++) {
            amounts[i] = betAmounts[i].get();
        }
        return amounts;
    }
}

// 3 answers, max 1 selection
class Level_4 extends JPanel {
    private Topics topic;
    private AtomicInteger[] betAmounts;
    private JCheckBox[] checkBox;
    private String[] answers;
    private int correctAnswerIndex;

    public Level_4(GameWindow window, Topics topic) {

        this.topic = topic;
        this.betAmounts = new AtomicInteger[3];
        this.correctAnswerIndex = getCorrectAnswer.getCorrectIndex(topic);

        // Initialize betAmounts array
        for (int i = 0; i < 3; i++) {
            betAmounts[i] = new AtomicInteger(0);
        }

        // Initialize the answers array properly
        this.answers = getCorrectAnswer.getRandomAnswers(topic, 3);

        JButton next = new JButton("Submit");
        next.setFont(new Font("Arial", Font.BOLD, 30));
        next.setBounds(388, 521, 198, 72);
        setLayout(null);
        add(next);

        this.checkBox = new JCheckBox[3];

        checkBox[0] = new JCheckBox("<html>" + answers[0] + "</html>");
        checkBox[0].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[0].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[0].setBounds(21, 110, 295, 75);
        add(checkBox[0]);

        checkBox[1] = new JCheckBox("<html>" + answers[1] + "</html>");
        checkBox[1].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[1].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[1].setBounds(21, 190, 295, 75);
        add(checkBox[1]);

        checkBox[2] = new JCheckBox("<html>" + answers[2] + "</html>");
        checkBox[2].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[2].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[2].setBounds(21, 270, 295, 75);
        add(checkBox[2]);

        JLabel currentAmount = new JLabel("Current Amount - ");
        currentAmount.setFont(new Font("Annai MN", Font.PLAIN, 20));
        currentAmount.setHorizontalAlignment(SwingConstants.CENTER);
        currentAmount.setBounds(31, 524, 178, 68);
        add(currentAmount);

        JLabel currentAmountMoney = new JLabel(String.valueOf(GameWindow.current_amount.get()));
        currentAmountMoney.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        currentAmountMoney.setBounds(221, 542, 97, 33);
        add(currentAmountMoney);

        JLabel quesTion = new JLabel("<html>" + topic.Question() + "</html>");
        quesTion.setHorizontalAlignment(SwingConstants.CENTER);
        quesTion.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        quesTion.setVerticalAlignment(SwingConstants.TOP);
        quesTion.setBounds(38, 32, 550, 79);
        add(quesTion);

        JButton addition_1 = new JButton("+");
        addition_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_1.setBounds(328, 120, 60, 60);
        add(addition_1);

        JButton subtraction_1 = new JButton("-");
        subtraction_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_1.setBounds(526, 120, 60, 60);
        add(subtraction_1);

        JButton addition_2 = new JButton("+");
        addition_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_2.setBounds(328, 200, 60, 60);
        add(addition_2);

        JButton addition_3 = new JButton("+");
        addition_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_3.setBounds(328, 280, 60, 60);
        add(addition_3);

        JButton subtraction_2 = new JButton("-");
        subtraction_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_2.setBounds(526, 200, 60, 60);
        add(subtraction_2);

        JButton subtraction_3 = new JButton("-");
        subtraction_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_3.setBounds(526, 280, 60, 60);
        add(subtraction_3);

        JLabel initialValue_1 = new JLabel(String.valueOf(betAmounts[0].get()));
        initialValue_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_1.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_1.setBounds(400, 120, 114, 60);
        add(initialValue_1);

        JLabel initialValue_2 = new JLabel(String.valueOf(betAmounts[1].get()));
        initialValue_2.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_2.setBounds(400, 200, 114, 60);
        add(initialValue_2);

        JLabel initialValue_3 = new JLabel(String.valueOf(betAmounts[2].get()));
        initialValue_3.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_3.setBounds(400, 280, 114, 60);
        add(initialValue_3);

        // max 1 selection out of 3
        for (JCheckBox cb : checkBox) {
            cb.addActionListener(e -> {
                int selectedCount = countSelectedCheckboxes(checkBox);
                if (selectedCount > 1 && ((JCheckBox)e.getSource()).isSelected()) {
                    ((JCheckBox)e.getSource()).setSelected(false);
                }
            });
        }

        next.addActionListener(e -> {
            int selectedCount = countSelectedCheckboxes(checkBox);

            if (selectedCount == 1) {
                boolean[] correctSelections = calculateCorrectSelections();
                int[] betAmountsArray = getBetAmountsArray();

                // Store the data in GameWindow to pass to Result_4
                window.setLevelResults(correctSelections, betAmountsArray);
                // Show Result_4 screen after setting results
                window.showResult4();
            }
        });

        // checkBox 1
        addition_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[0].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[0].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_1.setText(String.valueOf(betAmounts[0].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        subtraction_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[0].isSelected() && betAmounts[0].get() >= 100000) {
                    betAmounts[0].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_1.setText(String.valueOf(betAmounts[0].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        // checkBox 2
        addition_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[1].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[1].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_2.setText(String.valueOf(betAmounts[1].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
        subtraction_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[1].isSelected() && betAmounts[1].get() >= 100000) {
                    betAmounts[1].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_2.setText(String.valueOf(betAmounts[1].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        // checkBox 3
        addition_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[2].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[2].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_3.setText(String.valueOf(betAmounts[2].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
        subtraction_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[2].isSelected() && betAmounts[2].get() >= 100000) {
                    betAmounts[2].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_3.setText(String.valueOf(betAmounts[2].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
    }

    private int countSelectedCheckboxes(JCheckBox[] checkboxes) {
        int count = 0;
        for (JCheckBox cb : checkboxes) {
            if (cb.isSelected()) {
                count++;
            }
        }
        return count;
    }

    private boolean[] calculateCorrectSelections() {
        boolean[] correct = new boolean[3];
        // Find which shuffled answers correspond to the correct answer
        String correctAnswerText = topic.Answer()[correctAnswerIndex];

        for (int i = 0; i < answers.length; i++) {
            correct[i] = answers[i].equals(correctAnswerText);
        }
        return correct;
    }

    private int[] getBetAmountsArray() {
        int[] amounts = new int[3];
        for (int i = 0; i < 3; i++) {
            amounts[i] = betAmounts[i].get();
        }
        return amounts;
    }
}

// 2 answers, max 1 selection
class Level_5 extends JPanel {
    private Topics topic;
    private AtomicInteger[] betAmounts;
    private JCheckBox[] checkBox;
    private String[] answers;
    private int correctAnswerIndex;

    public Level_5(GameWindow window, Topics topic) {

        this.topic = topic;
        this.betAmounts = new AtomicInteger[2];
        this.correctAnswerIndex = getCorrectAnswer.getCorrectIndex(topic);

        // Initialize betAmounts array
        for (int i = 0; i < 2; i++) {
            betAmounts[i] = new AtomicInteger(0);
        }

        // Initialize the answers array properly
        this.answers = getCorrectAnswer.getRandomAnswers(topic, 2);

        JButton next = new JButton("Submit");
        next.setFont(new Font("Arial", Font.BOLD, 30));
        next.setBounds(388, 521, 198, 72);
        setLayout(null);
        add(next);

        this.checkBox = new JCheckBox[2];

        checkBox[0] = new JCheckBox("<html>" + answers[0] + "</html>");
        checkBox[0].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[0].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[0].setBounds(21, 110, 295, 75);
        add(checkBox[0]);

        checkBox[1] = new JCheckBox("<html>" + answers[1] + "</html>");
        checkBox[1].setFont(new Font("Arial", Font.PLAIN, 20));
        checkBox[1].setHorizontalAlignment(SwingConstants.LEFT);
        checkBox[1].setBounds(21, 190, 295, 75);
        add(checkBox[1]);

        JLabel currentAmount = new JLabel("Current Amount - ");
        currentAmount.setFont(new Font("Annai MN", Font.PLAIN, 20));
        currentAmount.setHorizontalAlignment(SwingConstants.CENTER);
        currentAmount.setBounds(31, 524, 178, 68);
        add(currentAmount);

        JLabel currentAmountMoney = new JLabel(String.valueOf(GameWindow.current_amount.get()));
        currentAmountMoney.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        currentAmountMoney.setBounds(221, 542, 97, 33);
        add(currentAmountMoney);

        JLabel quesTion = new JLabel("<html>" + topic.Question() + "</html>");
        quesTion.setHorizontalAlignment(SwingConstants.CENTER);
        quesTion.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        quesTion.setVerticalAlignment(SwingConstants.TOP);
        quesTion.setBounds(38, 32, 550, 79);
        add(quesTion);

        JButton addition_1 = new JButton("+");
        addition_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_1.setBounds(328, 120, 60, 60);
        add(addition_1);

        JButton subtraction_1 = new JButton("-");
        subtraction_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_1.setBounds(526, 120, 60, 60);
        add(subtraction_1);

        JButton addition_2 = new JButton("+");
        addition_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        addition_2.setBounds(328, 200, 60, 60);
        add(addition_2);

        JButton subtraction_2 = new JButton("-");
        subtraction_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        subtraction_2.setBounds(526, 200, 60, 60);
        add(subtraction_2);

        JLabel initialValue_1 = new JLabel(String.valueOf(betAmounts[0].get()));
        initialValue_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_1.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_1.setBounds(400, 120, 114, 60);
        add(initialValue_1);

        JLabel initialValue_2 = new JLabel(String.valueOf(betAmounts[1].get()));
        initialValue_2.setHorizontalAlignment(SwingConstants.CENTER);
        initialValue_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        initialValue_2.setBounds(400, 200, 114, 60);
        add(initialValue_2);

        // max 1 selection out of 2
        for (JCheckBox cb : checkBox) {
            cb.addActionListener(e -> {
                int selectedCount = countSelectedCheckboxes(checkBox);
                if (selectedCount > 1 && ((JCheckBox)e.getSource()).isSelected()) {
                    ((JCheckBox)e.getSource()).setSelected(false);
                }
            });
        }

        next.addActionListener(e -> {
            int selectedCount = countSelectedCheckboxes(checkBox);

            if (selectedCount == 1) {
                boolean[] correctSelections = calculateCorrectSelections();
                int[] betAmountsArray = getBetAmountsArray();

                // Store the data in GameWindow to pass to Result_5
                window.setLevelResults(correctSelections, betAmountsArray);
                // Show Result_5 screen after setting results
                window.showResult5();
            }
        });

        // checkBox 1
        addition_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[0].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[0].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_1.setText(String.valueOf(betAmounts[0].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        subtraction_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[0].isSelected() && betAmounts[0].get() >= 100000) {
                    betAmounts[0].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_1.setText(String.valueOf(betAmounts[0].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });

        // checkBox 2
        addition_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[1].isSelected() && GameWindow.current_amount.get() >= 100000) {
                    betAmounts[1].addAndGet(100000);
                    GameWindow.current_amount.addAndGet(-100000);
                    initialValue_2.setText(String.valueOf(betAmounts[1].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
        subtraction_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox[1].isSelected() && betAmounts[1].get() >= 100000) {
                    betAmounts[1].addAndGet(-100000);
                    GameWindow.current_amount.addAndGet(100000);
                    initialValue_2.setText(String.valueOf(betAmounts[1].get()));
                    currentAmountMoney.setText(String.valueOf(GameWindow.current_amount.get()));
                }
            }
        });
    }

    private int countSelectedCheckboxes(JCheckBox[] checkboxes) {
        int count = 0;
        for (JCheckBox cb : checkboxes) {
            if (cb.isSelected()) {
                count++;
            }
        }
        return count;
    }

    private boolean[] calculateCorrectSelections() {
        boolean[] correct = new boolean[2];
        // Find which shuffled answers correspond to the correct answer
        String correctAnswerText = topic.Answer()[correctAnswerIndex];

        for (int i = 0; i < answers.length; i++) {
            correct[i] = answers[i].equals(correctAnswerText);
        }
        return correct;
    }

    private int[] getBetAmountsArray() {
        int[] amounts = new int[2];
        for (int i = 0; i < 2; i++) {
            amounts[i] = betAmounts[i].get();
        }
        return amounts;
    }
}

class Result_1 extends JPanel {

    public Result_1(GameWindow window) {

        setLayout(null);

        // Get the results from GameWindow
        int finalAmount = window.getLevelFinalAmount(); // money from level_1
        boolean[] correctSelections = window.getLevelCorrectSelections(); // correct answer
        int[] betAmounts = window.getLevelBetAmounts(); // how much bet on each answer
        String correctAnswerText = window.getLevelCorrectAnswerText(); // text the correct answer

        JButton next = new JButton("Next Level");
        next.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        next.setBounds(499, 524, 198, 72);
        next.addActionListener(e -> {
            if (finalAmount <= 0) {
                window.showScreen("Lose");
            } else {
                window.showScreen("Topic_2");
            }
        });
        add(next);

        JLabel lblNewLabel = new JLabel("The Correct Answer ");
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel.setBounds(31, 151, 397, 107);
        add(lblNewLabel);

        JLabel currentAmount = new JLabel("Current Amount - ");
        currentAmount.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        currentAmount.setHorizontalAlignment(SwingConstants.LEFT);
        currentAmount.setBounds(31, 524, 271, 68);
        add(currentAmount);

        // Show correct answer text here
        JLabel lblNewLabel_1 = new JLabel("<html>" + correctAnswerText + "</html>");
        lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1.setBounds(41, 270, 656, 144);
        add(lblNewLabel_1);

        JLabel currentAmountMoney = new JLabel(String.valueOf(finalAmount));
        currentAmountMoney.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        currentAmountMoney.setHorizontalAlignment(SwingConstants.LEFT);
        currentAmountMoney.setBounds(310, 541, 177, 40);
        add(currentAmountMoney);

        JLabel lblNewLabel_2 = new JLabel("Level 1");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 50));
        lblNewLabel_2.setBounds(238, 25, 209, 125);
        add(lblNewLabel_2);
    }
}

class Result_2 extends JPanel {

    public Result_2(GameWindow window) {

        setLayout(null);

        int finalAmount = window.getLevelFinalAmount();
        boolean[] correctSelections = window.getLevelCorrectSelections();
        int[] betAmounts = window.getLevelBetAmounts();
        String correctAnswerText = window.getLevelCorrectAnswerText();

        JButton next = new JButton("Next Level");
        next.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        next.setBounds(499, 524, 198, 72);
        next.addActionListener(e -> {
            if (finalAmount <= 0) {
                window.showScreen("Lose");
            } else {
                window.showScreen("Topic_3");
            }
        });
        add(next);

        JLabel lblNewLabel = new JLabel("The Correct Answer ");
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel.setBounds(31, 151, 397, 107);
        add(lblNewLabel);

        JLabel currentAmount = new JLabel("Current Amount - ");
        currentAmount.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        currentAmount.setHorizontalAlignment(SwingConstants.LEFT);
        currentAmount.setBounds(31, 524, 271, 68);
        add(currentAmount);

        JLabel lblNewLabel_1 = new JLabel("<html>" + correctAnswerText + "</html>");
        lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1.setBounds(41, 270, 656, 144);
        add(lblNewLabel_1);

        JLabel currentAmountMoney = new JLabel(String.valueOf(finalAmount));
        currentAmountMoney.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        currentAmountMoney.setHorizontalAlignment(SwingConstants.LEFT);
        currentAmountMoney.setBounds(310, 541, 177, 40);
        add(currentAmountMoney);

        JLabel lblNewLabel_2 = new JLabel("Level 2");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 50));
        lblNewLabel_2.setBounds(238, 25, 209, 125);
        add(lblNewLabel_2);
    }
}

class Result_3 extends JPanel {

    public Result_3(GameWindow window) {

        setLayout(null);

        int finalAmount = window.getLevelFinalAmount();
        boolean[] correctSelections = window.getLevelCorrectSelections();
        int[] betAmounts = window.getLevelBetAmounts();
        String correctAnswerText = window.getLevelCorrectAnswerText();

        JButton next = new JButton("Next Level");
        next.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        next.setBounds(499, 524, 198, 72);
        next.addActionListener(e -> {
            if (finalAmount <= 0) {
                window.showScreen("Lose");
            } else {
                window.showScreen("Topic_4");
            }
        });
        add(next);

        JLabel lblNewLabel = new JLabel("The Correct Answer ");
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel.setBounds(31, 151, 397, 107);
        add(lblNewLabel);

        JLabel currentAmount = new JLabel("Current Amount - ");
        currentAmount.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        currentAmount.setHorizontalAlignment(SwingConstants.LEFT);
        currentAmount.setBounds(31, 524, 271, 68);
        add(currentAmount);

        JLabel lblNewLabel_1 = new JLabel("<html>" + correctAnswerText + "</html>");
        lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1.setBounds(41, 270, 656, 144);
        add(lblNewLabel_1);

        JLabel currentAmountMoney = new JLabel(String.valueOf(finalAmount));
        currentAmountMoney.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        currentAmountMoney.setHorizontalAlignment(SwingConstants.LEFT);
        currentAmountMoney.setBounds(310, 541, 177, 40);
        add(currentAmountMoney);

        JLabel lblNewLabel_2 = new JLabel("Level 3");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 50));
        lblNewLabel_2.setBounds(238, 25, 209, 125);
        add(lblNewLabel_2);
    }
}

class Result_4 extends JPanel {

    public Result_4(GameWindow window) {

        setLayout(null);

        int finalAmount = window.getLevelFinalAmount();
        boolean[] correctSelections = window.getLevelCorrectSelections();
        int[] betAmounts = window.getLevelBetAmounts();
        String correctAnswerText = window.getLevelCorrectAnswerText();

        JButton next = new JButton("Next Level");
        next.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        next.setBounds(499, 524, 198, 72);
        next.addActionListener(e -> {
            if (finalAmount <= 0) {
                window.showScreen("Lose");
            } else {
                window.showScreen("Topic_5");
            }
        });
        add(next);

        JLabel lblNewLabel = new JLabel("The Correct Answer ");
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel.setBounds(31, 151, 397, 107);
        add(lblNewLabel);

        JLabel currentAmount = new JLabel("Current Amount - ");
        currentAmount.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        currentAmount.setHorizontalAlignment(SwingConstants.LEFT);
        currentAmount.setBounds(31, 524, 271, 68);
        add(currentAmount);

        JLabel lblNewLabel_1 = new JLabel("<html>" + correctAnswerText + "</html>");
        lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1.setBounds(41, 270, 656, 144);
        add(lblNewLabel_1);

        JLabel currentAmountMoney = new JLabel(String.valueOf(finalAmount));
        currentAmountMoney.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        currentAmountMoney.setHorizontalAlignment(SwingConstants.LEFT);
        currentAmountMoney.setBounds(310, 541, 177, 40);
        add(currentAmountMoney);

        JLabel lblNewLabel_2 = new JLabel("Level 4");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 50));
        lblNewLabel_2.setBounds(238, 25, 209, 125);
        add(lblNewLabel_2);
    }
}

class Result_5 extends JPanel {

    public Result_5(GameWindow window) {

        setLayout(null);

        int finalAmount = window.getLevelFinalAmount();
        boolean[] correctSelections = window.getLevelCorrectSelections();
        int[] betAmounts = window.getLevelBetAmounts();
        String correctAnswerText = window.getLevelCorrectAnswerText();

        JLabel lblNewLabel = new JLabel("The Correct Answer ");
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel.setBounds(31, 151, 397, 107);
        add(lblNewLabel);

        JLabel currentAmount = new JLabel("Final Amount - ");
        currentAmount.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        currentAmount.setHorizontalAlignment(SwingConstants.LEFT);
        currentAmount.setBounds(31, 524, 271, 68);
        add(currentAmount);

        JLabel lblNewLabel_1 = new JLabel("<html>" + correctAnswerText + "</html>");
        lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1.setBounds(41, 270, 656, 144);
        add(lblNewLabel_1);

        JLabel currentAmountMoney = new JLabel(String.valueOf(finalAmount));
        currentAmountMoney.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        currentAmountMoney.setHorizontalAlignment(SwingConstants.LEFT);
        currentAmountMoney.setBounds(310, 541, 177, 40);
        add(currentAmountMoney);

        JLabel lblNewLabel_2 = new JLabel("Level 5");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 50));
        lblNewLabel_2.setBounds(238, 25, 209, 125);
        add(lblNewLabel_2);

        String msg = (finalAmount > 0)
                ? "Congratulations! You won " + finalAmount + "!"
                : "Game Over. You lost all the money.";

        JLabel final_label = new JLabel(msg);
        final_label.setHorizontalAlignment(SwingConstants.CENTER);
        final_label.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        final_label.setBounds(50, 460, 650, 40);
        add(final_label);
    }
}

class FinalResultLose extends JPanel {
    public FinalResultLose(GameWindow window) {
        setLayout(null);

        JLabel lbl = new JLabel("GAME OVER");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        lbl.setFont(new Font("Lucida Grande", Font.BOLD, 50));
        lbl.setBounds(50, 150, 640, 80);
        add(lbl);

        JLabel msg = new JLabel("You have 0 money left.");
        msg.setHorizontalAlignment(SwingConstants.CENTER);
        msg.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        msg.setBounds(50, 240, 640, 60);
        add(msg);

        JButton restart = new JButton("Restart");
        restart.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        restart.setBounds(260, 360, 200, 70);
        restart.addActionListener(e -> {
            GameWindow.current_amount.set(1000000);
            window.showScreen("Start");
        });
        add(restart);
    }
}

public class money_drop_sejong {
    public static void main(String[] args) {
        new GameWindow();
    }
}