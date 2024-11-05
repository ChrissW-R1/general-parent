const webpackConfig = require("./webpack.config.js");

module.exports = function(grunt) {
	const packageJson = grunt.file.readJSON("package.json");

	// Project configuration
	grunt.initConfig(
		{
			pkg:     packageJson,
			eslint:  {
				options: {
					overrideConfigFile: "eslint.config.js"
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
					src:      "${project.build.sourceDirectory}/**/*.ts",
					dest:     "${project.build.directory}/generated-sources/ts-compiled"
				}
			},
			less:    {
				main: {
					options: {
						paths:    [
							"src/main/less"
						],
						compress: true
					},
					files:   {
						"${project.build.directory}/dist/style/main.css": [
							"${project.build.sourceDirectory}/../less/**/*.less"
						]
					}
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
							ext:    ".js"
						}
					]
				}
			},
			htmlmin: {
				main: {
					options: {
						removeComments:     true,
						collapseWhitespace: true
					},
					files:   [
						{
							expand: true,
							cwd:    "src/main/html",
							src:    [
								"*.html",
								"*.htm"
							],
							dest:   "${project.build.directory}/dist/"
						}
					]
				}
			},
			webpack: {
				myConfig: webpackConfig
			}
		}
	);

	// Load plugins
	grunt.loadNpmTasks("grunt-eslint");
	grunt.loadNpmTasks("grunt-ts");
	grunt.loadNpmTasks("grunt-contrib-less");
	grunt.loadNpmTasks("grunt-contrib-uglify");
	grunt.loadNpmTasks("grunt-contrib-htmlmin");
	grunt.loadNpmTasks("grunt-webpack");

	// Default task(s)
	grunt.registerTask(
		"default",
		[
			"eslint",
			"ts",
			"less",
			"uglify",
			"htmlmin",
			"webpack"
		]
	);
};
