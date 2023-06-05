package tms.karpovich.lesson12Files;

import java.io.File;
import java.io.FilenameFilter;

public class DocFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".doc");
    }
}
