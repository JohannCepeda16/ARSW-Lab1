package edu.escuelaing.arsw.loccount;

import java.io.IOException;

import org.junit.Test;

import edu.escuelaing.arsw.model.CodeLinesCounter;
import edu.escuelaing.arsw.model.Counter;
import edu.escuelaing.arsw.model.PhysicalLinesCounter;
import edu.escuelaing.arsw.model.Reader;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Unit test for counter App.
 */
public class AppTest {
    private final String file1 = "src/main/java/edu/escuelaing/arsw/loccount/Countlines.java";
    private final String file2 = "src/main/java/edu/escuelaing/arsw/model/Reader.java";

    @Test
    public void PhysicalCount1() throws IOException{
        Reader reader = new Reader();
        Counter counter = new PhysicalLinesCounter();
        assertEquals(counter.countLines(reader.ReadFile(file1)),54);
    }

    @Test
    public void PhysicalCount2() throws IOException{
        Reader reader = new Reader();
        Counter counter = new PhysicalLinesCounter();
        assertEquals(counter.countLines(reader.ReadFile(file2)),47);
    }

    @Test
    public void CodeCount1() throws IOException{
        Reader reader = new Reader();
        Counter counter = new CodeLinesCounter();
        assertEquals(counter.countLines(reader.ReadFile(file1)),31);
    }

    @Test
    public void CodeCount2() throws IOException{
        Reader reader = new Reader();
        Counter counter = new CodeLinesCounter();
        assertEquals(counter.countLines(reader.ReadFile(file2)),26);
    }

    @Test
    public void MainTest(){
        try{
            String[] a = {"phy",file1};
            CountLines.main(a);
            assertTrue(true);
        }catch(Exception e){
            assertTrue(false);
        }
    }
    @Test
    public void MainTest2(){
        try{
            String[] a = {"phy",file2};
            CountLines.main(a);
            assertTrue(true);
        }catch(Exception e){
            assertTrue(false);
        }
    }
    @Test
    public void MainTest3(){
        try{
            String[] a = {"loc",file1};
            CountLines.main(a);
            assertTrue(true);
        }catch(Exception e){
            assertTrue(false);
        }
    }
    @Test
    public void MainTest4(){
        try{
            String[] a = {"loc",file2};
            CountLines.main(a);
            assertTrue(true);
        }catch(Exception e){
            assertTrue(false);
        }
    }

    @Test
    public void ExceptionTest(){
        try {
            String[] a = {"asf", file1};
            CountLines.main(a);
            assertFalse(false);
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}
