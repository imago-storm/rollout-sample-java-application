project 'Sample Rollout', {
    pipeline "Deploy", {
        task 'Checkout', {
            subprocedure = 'CheckoutCode'
            subproject = '/plugins/ECSCM-Git/project'

            actualParameter 'clone', '1'
            actualParameter 'commit', null
            actualParameter 'config', 'config'
            actualParameter 'depth', '1'
            actualParameter 'dest', null
            actualParameter 'GitBranch', '{{branch}}'
            actualParameter 'GitRepo', 'https://github.com/electric-cloud/3rdPartyIntegrations.git'
            actualParameter 'tag', null
        }
    }
}