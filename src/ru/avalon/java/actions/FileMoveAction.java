package ru.avalon.java.actions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * Действие, которое перемещает файлы в пределах дискового
 * пространства.
 */
public class FileMoveAction implements Action {

    private Path pathFrom;
    private Path pathTo;

    public FileMoveAction() { }

    public void setPathFrom(Path pathFrom) {
        this.pathFrom = pathFrom;
    }

    public void setPathTo(Path pathTo) {
        this.pathTo = pathTo;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        /*
         * TODO №4 Реализуйте метод run класса FileMoveAction
         */
        try {
            Files.move(pathFrom, pathTo, REPLACE_EXISTING);
        } catch (IOException ex) {/*ex.printStackTrace();*/}
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws Exception {
        /*
         * TODO №5 Реализуйте метод close класса FileMoveAction
         */
        threadPool.shutdownNow();
    }

}
