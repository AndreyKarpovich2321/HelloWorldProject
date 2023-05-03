package tms.karpovich.lesson12;

import java.io.File;
import java.io.FilenameFilter;

public class DocFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".doc");
    }
}
