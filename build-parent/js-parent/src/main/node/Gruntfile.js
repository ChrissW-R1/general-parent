const webpackConfig = require(
	"${project.module-root.relativedir}/webpack.config.js"
);

module.exports = function(grunt) {
	// Project configuration
	grunt.initConfig({
						 pkg:     grunt.file.readJSON("package.json"),
						 eslint:  {
							 options: {
								 overrideConfigFile: ".eslintrc.json"
							 },
							 target:  [
								 "${project.build.sourceDirectory}/**/*.ts"
							 ]
						 },
						 ts:      {
							 options: {
								 rootDir: "${project.build.sourceDirectory}"
							 },
							 main:    {
								 tsconfig: true,
								 src:      "${project.build.sourceDirectory}/**/*.ts",
								 dest:     "${project.build.directory}/generated-sources/ts-compiled"
							 }
						 },
						 uglify:  {
							 options: {
								 sourceMap: true
							 },
							 main:    {
								 files: [
									 {
										 expand: true,
										 cwd:    "${project.build.directory}/generated-sources/ts-compiled",
										 src:    "**/*.js",
										 dest:   "${project.build.directory}/generated-sources/uglified",
										 ext:    ".min.js"
									 }
								 ]
							 }
						 },
						 webpack: {
							 myConfig: webpackConfig
						 }
					 });

	// Load plugins
	grunt.loadNpmTasks("grunt-eslint");
	grunt.loadNpmTasks("grunt-ts");
	grunt.loadNpmTasks("grunt-contrib-uglify");
	grunt.loadNpmTasks('grunt-webpack');

	// Default task(s)
	grunt.registerTask("default", [
		"eslint",
		"ts",
		"uglify",
		"webpack"
	]);
};
