package fr.sii.sonar.web.client.ng.quality;

import org.sonar.api.component.ResourcePerspectives;
import org.sonar.api.config.Settings;
import org.sonar.api.rules.RuleFinder;
import org.sonar.api.scan.filesystem.ModuleFileSystem;

import fr.sii.sonar.report.core.common.ReportSensor;
import fr.sii.sonar.report.core.quality.domain.report.QualityReport;
import fr.sii.sonar.report.core.quality.factory.JsonQualityReportProviderFactory;
import fr.sii.sonar.report.core.quality.factory.QualitySaverFactory;

/**
 * Just a specific implementation to help dependency injection
 * 
 * @author Aurélien Baudet
 *
 */
public class AngularQualitySensor extends ReportSensor<QualityReport> {

	public AngularQualitySensor(AngularQualityConstants constants, Settings settings, RuleFinder ruleFinder, ModuleFileSystem filesystem, ResourcePerspectives resourcePerspective) {
		super(constants, settings, ruleFinder, filesystem, resourcePerspective, new JsonQualityReportProviderFactory(), new QualitySaverFactory());
	}

}
