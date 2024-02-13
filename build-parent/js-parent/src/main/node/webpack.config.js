const path = require('path');

module.exports = {
	mode:   'production',
	entry:  `${project.build.directory}/generated-sources/uglified/app.min.js`,
	output: {
		path:     path.resolve(__dirname, 'target/dist'),
		filename: 'app.js'
	}
};
