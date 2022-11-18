/**
 *  A question with a text and an answer.
 */


public class Question
{
    private String text;
    private String answer;

    /**
     * COnstructs a question with empty question and answer.
     */
    public Question()
    {
        text = "";
        answer = "";
    }
    /**
     * Sets the question text.
     * @param questionText the text of this question.
     */
    public void setText(String questionText)
    {
        text = questionText;
    }

    /**
     * Set the answer to this question.
     * @param correctResponse the answer to this question.
     */
    public void setAnswer(String correctResponse)
    {
        answer = correctResponse;
    }

    /**
     * Checks a given response for correctness,
     * @param response the response to check
     * @return true if the response is correct, false otherwise
     */
    public boolean checkAnswer(String response)
    {
        return response.equals(answer);
    }

    /**
     * Displays the question.
     */
    public void display()
    {
        System.out.println(text);
    }


}
