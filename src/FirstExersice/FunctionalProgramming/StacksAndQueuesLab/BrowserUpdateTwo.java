package FirstExersice.FunctionalProgramming.StacksAndQueuesLab;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayDeque;

public class BrowserUpdateTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        ArrayDeque<String> urls = new ArrayDeque<>();
        ArrayDeque<String> forwardUrls = new ArrayDeque<>();

        while (!line.equals("Home")){
            if (line.equals("back")){
                if (urls.size() <= 1 ){
                    System.out.println("no previous URLs");
                    line = reader.readLine();
                    continue;
                }else {
                    String current = urls.pop();
                    forwardUrls.push(current);
                    System.out.println(urls.peek());
                }
            }else if (line.equals("forward")){
                if (forwardUrls.isEmpty()){
                    System.out.println("no next URLs");
                }else {
                    String ul = forwardUrls.pop();
                    urls.push(ul);
                    System.out.println(ul);
                }
            }else {
                urls.push(line);
                System.out.println(line);
                forwardUrls.clear();
            }
            line = reader.readLine();
        }
    }
}
