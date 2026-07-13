package Klausurvorbereitung.OstapSavchyn.Lektion18.VokalDoppler;

import java.io.IOException;
import java.io.Writer;

public class DoubleVowelWriter extends Writer {
    Writer out;
    public DoubleVowelWriter(Writer writer) {
        out = writer;
    }

    @Override
    public void write(int c) throws IOException {
        char v = (char) Character.toLowerCase(c);
        if (v == 'a' || v == 'e' ||v == 'i' ||v == 'o' ||v == 'u'){out.write(c);}
        out.write(c);
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        for (int i = off; i < off + len; i++) {
            write(cbuf[i]);
        }
    }

    @Override
    public void flush() throws IOException {
        out.flush();
    }

    @Override
    public void close() throws IOException {
        out.close();
    }
}
