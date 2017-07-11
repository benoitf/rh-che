/*******************************************************************************
 * Copyright (c) 2012-2017 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 *******************************************************************************/

package org.eclipse.che.api.deploy;

import org.eclipse.che.plugin.openshift.client.OpenShiftCommandAppender;

/**
 * Display the path to Bayesian log.
 * @author Florent Benoit
 */
public class OpenShiftBayesianLogCommandAppender implements OpenShiftCommandAppender {

    /**
     * Provides the command that will be executed on the container in addition to other commands.
     *
     * @return the command to execute
     */
    @Override
    public String getCommand() {
        return "echo \'   - ls-bayesian logs can be found in /home/user/che/ls-bayesian/bayesian.log\'";
    }
}
