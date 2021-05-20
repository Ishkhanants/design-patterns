package behavioral.command.client;

import behavioral.command.command.OpenTextFileOperation;
import behavioral.command.command.SaveTextFileOperation;
import behavioral.command.command.TextFileOperation;
import behavioral.command.invoker.TextFileOperationExecutor;
import behavioral.command.receiver.TextFile;

//TextFileApplication
public class Main {
    public static void main(String[] args) {

        TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("file2.txt"));
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        System.out.println(textFileOperationExecutor.executeOperation(openTextFileOperation));
        System.out.println(textFileOperationExecutor.executeOperation(saveTextFileOperation));
    }
}
