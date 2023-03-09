package experiment;

import common.ConfigurationParams;
import me.tongfei.progressbar.ProgressBar;
import me.tongfei.progressbar.ProgressBarBuilder;
import me.tongfei.progressbar.ProgressBarStyle;
import peernet.config.Configuration;
import peernet.core.Control;

/**
 * A lightweight progress bar that helps with the estimation of experiment execution time.
 * The progress bar captures every executable pars of the experiment, the initial delay, all cycles, and all phases for each cycle.
 * <p>
 * Execution at : Every phase of each cycle
 * Halt Condition : None
 */
public class CycleProgressBar implements Control {

    private ProgressBar progressBar;

    public CycleProgressBar(String prefix) {
        int totalCycles = Configuration.getInt(ConfigurationParams.TOTAL_CYCLES);

        // Build the progress bar
        progressBar = new ProgressBarBuilder()
                .setTaskName("Progress")
                .setInitialMax(totalCycles)
                // The simplest of all styles
                .setStyle(ProgressBarStyle.ASCII)
                .build();
    }

    @Override
    public boolean execute() {
        progressBar.step();
        return false;
    }
}