import { Container, Typography, Grid } from '@mui/material';
import Page from '../components/Page';
import CommunityCard from '../layouts/market/CommunityCard';

function Market() {
	return (
		<Page>
			<Typography
				variant='h2'
				align='center'
				paddingTop='15px'
				paddingBottom='15px'
			>
				Explore Collections
			</Typography>
			<hr />
			<Container maxWidth='xl' sx={{ pt: '30px' }}>
				<Grid container spacing={6}>
					<Grid sx={{ mb: 5 }} item xs={12} sm={6} md={4} lg={3}>
						<CommunityCard />
					</Grid>
					<Grid sx={{ mb: 5 }} item xs={12} sm={6} md={4} lg={3}>
						<CommunityCard />
					</Grid>
					<Grid sx={{ mb: 5 }} item xs={12} sm={6} md={4} lg={3}>
						<CommunityCard />
					</Grid>
					<Grid sx={{ mb: 5 }} item xs={12} sm={6} md={4} lg={3}>
						<CommunityCard />
					</Grid>
					<Grid sx={{ mb: 5 }} item xs={12} sm={6} md={4} lg={3}>
						<CommunityCard />
					</Grid>
					<Grid sx={{ mb: 5 }} item xs={12} sm={6} md={4} lg={3}>
						<CommunityCard />
					</Grid>
					<Grid sx={{ mb: 5 }} item xs={12} sm={6} md={4} lg={3}>
						<CommunityCard />
					</Grid>
				</Grid>
			</Container>
		</Page>
	);
}

export default Market;