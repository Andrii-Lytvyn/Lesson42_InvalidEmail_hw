public class InvalidEmail extends IllegalArgumentException{
  public InvalidEmail(String line)
  {
    super(("Incorrect E-Mail, no '@' or '.' : " + line));
  }
}
